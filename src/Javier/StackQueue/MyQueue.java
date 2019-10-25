package Javier.StackQueue;

import java.util.ArrayList;

public class MyQueue {

    private final ArrayList<Object> cola;

    public MyQueue() {
        cola = new ArrayList<>();
    }

    public void agregar(Object item) {
        this.cola.add(item);
    }

    public Object remove() {
        Object head = this.cola.get(0);
        this.cola.remove(0);
        return head;
    }

    public void imprimir() {
        for (Object item : cola) {
            System.out.println(" " + item.toString());
        }
    }

}
