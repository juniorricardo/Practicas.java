package Javier.LinkedList.Ejercicios.Objeto;

import java.util.*;

public class ColaEspera {
    /**
     * Clase interna para almacenar todos los
     * datos de un cliente
     */
    private static class DatosCliente {
        Cliente c;
        long entrada, salida; // milisegundos

        /**
         * Constructor; pone la hora de entrada
         */
        DatosCliente(Cliente c) {
            this.c = c;
            entrada = Reloj.ahora();
        }

        void atiende() {
            salida = Reloj.ahora();
        }
    }

    // colas del servicio
    private Queue<DatosCliente> colaEspera;
    private Queue<DatosCliente> colaAtendidos;

    /**
     * Constructor de ColaEspera
     */
    public ColaEspera() {
        colaEspera = new LinkedList<DatosCliente>();
        colaAtendidos = new
                LinkedList<DatosCliente>();
    }

    /**
     * Nuevo cliente; se mete en la cola de espera
     */
    public void nuevoCliente(Cliente c) {
        DatosCliente datos = new DatosCliente(c);
        colaEspera.add(datos);
    }

    /**
     * Atender cliente: se saca de la cola de
     * espera y se mete en la de atendidos;
     * retorna el cliente atendido
     */
    public Cliente atenderCliente()
            throws NoSuchElementException {
        DatosCliente datos = colaEspera.remove();
        datos.atiende();
        colaAtendidos.add(datos);
        return datos.c;
    }

    public double tiempoEsperaAtendidos() {
        long tiempo = 0;
        int num = 0;
        for (DatosCliente datos : colaAtendidos) {
            tiempo = tiempo + datos.salida - datos.entrada;
            num++;
        }
        if (num == 0) {
            return 0.0;
        } else {
            return (((double) tiempo) / num) / 1000.0;
        }
    }
}
