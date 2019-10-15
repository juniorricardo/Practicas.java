package Javier;

import java.util.Scanner;

public class OrdenarArreglo {

    private int[] arreglo;

    public OrdenarArreglo() {
        this.arreglo = new int[4];
    }

    public void cargarArreglo() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        for (int pos = 0; pos < arreglo.length; pos++)
            arreglo[pos] = lector.nextInt();
    }

    public void ordenarArreglo() {
        int aux = 999;
        for (int puntero = 0; puntero < arreglo.length; puntero++) {
            for (int actual = puntero + 1; actual < arreglo.length; actual++) {
                if (arreglo[actual] <= arreglo[puntero]) {
                    aux = arreglo[actual];
                    arreglo[actual] = arreglo[puntero];
                    arreglo[puntero] = aux;
                }
            }
        }
    }

    public void imprimirArreglo() {
        System.out.println("Arreglo: ");
        for (int pos : arreglo)
            System.out.print(pos + " ");
    }
}
