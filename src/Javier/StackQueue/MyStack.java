package Javier.StackQueue;

import java.util.ArrayList;

public class MyStack {

    private final ArrayList<Object> pila;

    public MyStack() {
        this.pila = new ArrayList<>();
    }

    public void push(Object valor) {
        this.pila.add(valor);
    }

    public Object top() {
        Object valorRetornado = this.pila.get(this.pila.size() - 1);
        this.pila.remove(this.pila.size() - 1);
        return valorRetornado;
    }

    public void imprimir() {
        for (Object item : pila)
            System.out.println("> " + item.toString());
    }


}
