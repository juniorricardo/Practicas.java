package Javier.LinkedList.Tomas;

public class ListaTomas {
    //Atributos
    private NodoTomas primero; //no tocar
    private NodoTomas ultimo;   //siempre que se agrega un nodo,  ultimo pasa a ser ese nodo tambien
    private int cantidad;

    //Constructor
    public ListaTomas() {
        this.cantidad = 0;
        this.primero = null;
        this.ultimo = null;
    }

    public NodoTomas getUltimo() {
        return ultimo;
    }

    public NodoTomas getPrimero() {
        return primero;
    }

    public int getCantidad() {
        contarNodos();
        return this.cantidad;
    }

    private void contarNodos(){
        cantidad = 0;
        NodoTomas nodo = this.primero;
        while(nodo != null){
            cantidad += 1;
            nodo = nodo.getSiguiente();
        }
    }

    //Cargar la lista enlazada
    public void cargarLista(int nuevo) {
        if (this.primero == null) {
            this.primero = new NodoTomas(nuevo);
            this.ultimo = this.primero;
        } else {
            NodoTomas nodo = new NodoTomas(nuevo);
            this.ultimo.setSiguiente(nodo);
            this.ultimo = nodo;
        }
    }

    //Mostrar en pantalla cada uno de los nodos
    public void imprimirLista() {
        NodoTomas nodo = this.primero;
        System.out.print("Lista enlazada: ");
        while (nodo != null) {
            System.out.print("[" + nodo.getDato() + "]->");
            nodo = nodo.getSiguiente();
        }
        System.out.println(" null");
    }

}
