package Javier.LinkedList.ImportLL;

import java.util.LinkedList;

public class NuevoLinkedList {

    private LinkedList<Dato> object = new LinkedList<Dato>();

    public void agregarNodo(int numero){
        this.object.add(new Dato(numero));
    }

    public void recorrerLista(){
        for(int i = this.object.size() -1 ; i >= 0 ;i--)
            System.out.println(this.object.get(i).getDato());
    }
    public Dato recorridoRecursivo(){
        return object.getFirst();
    }
}
