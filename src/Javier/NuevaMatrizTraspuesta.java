package Javier;

import java.util.Scanner;

public class NuevaMatrizTraspuesta {

    private int[][] matriz;

    public NuevaMatrizTraspuesta() {
        this.matriz = new int[3][3];
    }

    public void cargarMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++)
                this.matriz[fila][columna] = obtenerNumero();
        }
    }

    public void iniciarOperacion() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = fila; columna < matriz.length; columna++) {
                int aux = matriz[fila][columna];
                matriz[fila][columna] = matriz[columna][fila];
                matriz[columna][fila] = aux;
            }
        }
    }

    public void imprimirMatriz() {
        for (int[] fila : matriz) {
            for (int valor : fila)
                System.out.print(valor + " ");
            System.out.println();
        }
    }

    private int obtenerNumero() {
        return (int) (Math.random() * 9) + 1;
    }

}
