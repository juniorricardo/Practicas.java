package Javier.LinkedList.Tomas;

public class NodoTomas {

    //Atributos
    private final int dato;
    private NodoTomas siguiente;
    //Constructor
    public NodoTomas(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public NodoTomas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTomas siguiente) {
        this.siguiente = siguiente;
    }

}
