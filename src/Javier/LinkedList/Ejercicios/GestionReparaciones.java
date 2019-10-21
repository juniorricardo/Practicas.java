package Javier.LinkedList.Ejercicios;

import Javier.LinkedList.Ejercicios.Objeto.FichaVehiculo;
import Javier.LinkedList.Ejercicios.Objeto.Reloj;

import java.util.*;

public class GestionReparaciones {
    //Atributos
    private LinkedList<FichaVehiculo> lista = new LinkedList<FichaVehiculo>();

    /**
     * Metodo que añade un vehiculo para ser arreglado con una fecha
     * de entrada
     *
     * @param nombre
     * @param matricula
     */
    public void anadeVehiculo(String nombre, String matricula) {
        long f = Reloj.ahora();
        FichaVehiculo fich = new FichaVehiculo(nombre, matricula, f);//creamos un nuevo vehículo
        lista.add(fich);//añadimos
    }

    /**
     * Metodo que añade una fecha de reparacion a un vehiculo
     *
     * @param matricula
     */
    public void reparado(String matricula) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < lista.size()) {

//condiciones que ha de cumplir(todas)
            if (lista.get(i).matricula().equals(matricula) && lista.get(i).fechaReparacion() == 0) {

                lista.get(i).modificaFechaReparacion(Reloj.ahora());
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado == true) {
            System.out.println("Fecha de reparación modificada correctamente");
        } else {
            System.out.println("Error al modificar la fecha de reparación del vehículo " + matricula);
        }
    }

    /**
     * Metodo que añade una fecha de salida a un vehiculo
     *
     * @param matricula
     */
    public void fechaSalidaTaller(String matricula) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < lista.size()) {

//condiciones que ha de cumplir(todas)
            if (lista.get(i).matricula().equals(matricula) && lista.get(i).fechaSalida() == 0 && lista.get(i).estaArreglado()) {

                lista.get(i).modificaFechaSalida(Reloj.ahora());
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado == true) {
            System.out.println("Fecha de salida modificada correctamente");
        } else {
            System.out.println("Error al modificar la fecha de salida del vehículo " + matricula);
        }
    }

    /**
     * Borramos la primera fiche de un vehiculo
     *
     * @return
     */
    public boolean eliminarPrimerRegistro() {
        if (lista.isEmpty()) {
            return false;
        } else {
            lista.removeFirst();
            return true;
        }
    }

}