package Javier.LinkedList.Introduccion;

public class Lista {
    //Atributos
    private Nodo head;
    private Nodo tail;
    private int contador;

    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return tail;
    }

    //Cargar valores
    public void initCarga(int[] lista) {
        this.head = new Nodo(lista[0]);
        cargarLista(lista, 1, this.head);
    }
    private void cargarLista(int[] lista, int puntero, Nodo nodo) {
        if (puntero == lista.length) {
            this.tail = nodo;
            System.out.println("Se cargaron los nodos correctamente.");
        } else {
            nodo.setSiguiente(lista[puntero]);
            cargarLista(lista, ++puntero, nodo.getSiguiente());
        }
    }

    //Insertar nuevo Nodo
    public void agregarNodo(Nodo nodo, int pos){
        Nodo puntero = this.head;
        int actual = 1;
        while(puntero != null){
            if(pos == actual){
                nodo = puntero.getSiguiente();
                puntero.setSiguiente(nodo);
            }
            pos += 1;
            puntero = puntero.getSiguiente();
        }
    }

    //Iniciar conteo
    public void initConteo() {
        this.contador = 0;
//        contRecursivo(this.head);
        contIterativo();
    }
    private void contRecursivo(Nodo elemento) {
        if (elemento == null)
            System.out.println("Total de nodos: " + contador);
        else {
            contador++;
            contRecursivo(elemento.getSiguiente());
        }
    }
    private void contIterativo() {
        Nodo puntero = this.head;
        while (puntero != null) {
            contador += 1;
            puntero = puntero.getSiguiente();
        }
    }

    //Imprimir datos
    public void initImprimir() {
        System.out.print("> Linked list|»» ");
        toStringLista(this.head);
    }
    private void toStringLista(Nodo head) {
        if (head == null)
            System.out.print("null");
        else {
            System.out.print("[" + head.getDato() + "]-> ");
            toStringLista(head.getSiguiente());
        }
    }

}
