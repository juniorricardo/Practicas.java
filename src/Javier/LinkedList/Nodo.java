package Javier.LinkedList;

public class Nodo {
    //Atributos
    private int dato;
    private Nodo siguiente;
    //Constructor
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

    public Nodo getSiguiente(){
        return this.siguiente;
    }

}
