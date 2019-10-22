package Javier.LinkedList.ImportLL;

public class ClaseMain {
    public static void main(String[] args) {

        NuevoLinkedList elemento = new NuevoLinkedList();

        elemento.recorrerLista();

        elemento.agregarNodo(488);
        elemento.agregarNodo(5);
        elemento.agregarNodo(684);
        elemento.agregarNodo(31);
        elemento.agregarNodo(210);

        elemento.recorrerLista();
    }
}
