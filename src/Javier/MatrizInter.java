package Javier;

import java.util.ArrayList;

public class MatrizInter {

    public static void main(String[] args) {

        ArrayList<Integer> matrizUno = new ArrayList<Integer>();
        ArrayList<Integer> matrizDos = new ArrayList<Integer>();

        for (int i = 0; i <= 3; i++) {
            matrizUno.add(getNumero());
            matrizDos.add(getNumero());
        }

        System.out.println("Lista cargadas:");
        System.out.println("Matriz 'Uno'");
        for (int i = 0; i <= 3; i++)
            System.out.println("\t" + matrizUno.get(i));
        System.out.println("Matriz 'Dos'");
        for (int i = 0; i <= 3; i++)
            System.out.println("\t" + matrizDos.get(i));

        ArrayList<Integer> matrizNueva = new ArrayList<Integer>();
        for(int i = 0; i <= 3; i++){
            matrizNueva.add(matrizUno.get(i));
            matrizNueva.add(matrizDos.get(i));
        }

        System.out.println("Nueva Lista");
        for (int valor: matrizNueva )
            System.out.println("\t" + valor);

    }
    private static int getNumero() {
        return (int) (Math.random() * 10 + 1);
    }
}
