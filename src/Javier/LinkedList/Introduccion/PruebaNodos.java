package Javier.LinkedList.Introduccion;

import Javier.LinkedList.Tomas.ListaTomas;

import java.util.Scanner;

public class PruebaNodos {
    public static void main(String[] args){
//        iniciarLinkedList();
        Scanner lector = new Scanner(System.in);
        ListaTomas lista = new ListaTomas();
        System.out.println("Cuantos nodos desea ingresar?");
        int cantidad = lector.nextInt();
        System.out.println("-----------------------------------------");
        for (int i = 1; i <= cantidad; i++)
            lista.cargarLista(lector.nextInt());

        System.out.println("lista.getPrimero().getDato() = " + lista.getPrimero().getDato());
        System.out.println("lista.getUltimo().getDato() = " + lista.getUltimo().getDato());
        System.out.println("lista.getCantidad() = " + lista.getCantidad());
        lista.imprimirLista();
    }

    private static void iniciarLinkedList() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de nodos?");
        int[] numero = new int[lector.nextInt()];
        System.out.println("Ingrese datos correspondiente a los nodos: ");
        for (int indice = 0; indice < numero.length; indice++)
            numero[indice] = lector.nextInt();
        System.out.println();
        /*for (int valor:numero) {
            System.out.println(valor);
        }*/

        Lista miLista = new Lista();

        miLista.initCarga(numero);

        miLista.initConteo();

        miLista.initImprimir();
        System.out.println("\nmiLista.getHead().getDato() = " + miLista.getHead().getDato());
        System.out.println("miLista.getTail().getDato() = " + miLista.getTail().getDato());
    }
}
