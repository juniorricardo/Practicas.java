package Javier.LinkedList.Introduccion;

public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo(int numero){
        this.dato = numero;
        this.siguiente = null;
    }

    public int getDato(){
        return this.dato;
    }

    public void setSiguiente(int siguiente){
        this.siguiente = new Nodo(siguiente);
    }

    public void setSiguiente(Nodo nodo){
        this.siguiente = nodo;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }



}
