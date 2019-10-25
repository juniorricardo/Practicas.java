package Javier.StackQueue;

import java.util.ArrayList;

public class MyQueue {

    ArrayList<Object> cola;
    public MyQueue(){
        cola = new ArrayList<>();
    }
    public void add(Object item){
        this.add(item);
    }

    public Object remove(){
        Object head = this.cola.get(0);
        this.cola.remove(0);
        return head;
    }

    public void imprimir(){
        for (Object item: cola) {
            System.out.println(" " + item.toString());
        }
    }

}
