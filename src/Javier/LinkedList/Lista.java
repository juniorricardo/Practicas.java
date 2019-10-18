package Javier.LinkedList;

public class Lista {
    private Nodo head;
    private Nodo tail;
    private int contador = 0;

    //Cargar valores
    public void initCarga(int[] lista) {
        this.head = new Nodo(lista[0]);
        cargarLista(lista, 1, this.head);
    }
    private void cargarLista(int[] lista, int puntero, Nodo nodo) {
        if (puntero == lista.length)
            System.out.println("Fin de carga...");
        else {
            nodo.setSiguiente(lista[puntero]);
            cargarLista(lista, ++puntero, nodo.getSiguiente());
        }
    }

    //Iniciar conteo
    public void initConteo() {
        contarNodos(this.head);
    }
    private void contarNodos(Nodo elemento) {
        if (elemento == null)
            System.out.println("Total de nodos: " + contador);
        else {
            contador++;
            contarNodos(elemento.getSiguiente());
        }
    }

    //Imprimir datos
    public void initImprimir(){
        System.out.println("Head├>");
        toStringLista(this.head);
    }
    private void toStringLista(Nodo head) {
        if (head == null)
            System.out.print("null");
        else{
            System.out.print( "|" + head.getDato() + "|-->");
            toStringLista(head.getSiguiente());
        }
    }


    public Nodo getHead() {
        return head;
    }
    public Nodo getTail() {
        return tail;
    }
}
