package Javier.StackQueue;

public class PStackQueue {

    public static void main(String[] args) {

//        correrStack();

        correrQueue();


    }

    private static void correrQueue() {
        MyQueue cola = new MyQueue();
        cola.agregar("Hola");
        cola.agregar("me");
        cola.agregar("fui");
        cola.agregar("⚽");
        cola.imprimir();
        System.out.println("cola.remove() = " + cola.remove());
        cola.imprimir();
        System.out.println("cola.remove() = " + cola.remove());
        System.out.println("cola.remove() = " + cola.remove());
        System.out.println("cola.remove() = " + cola.remove());
    }

    public static void correrStack(){
        MyStack elemento = new MyStack();
        elemento.imprimir();
        elemento.push(1);
        elemento.push(true);
        elemento.push("tomas");
        elemento.imprimir();

        System.out.println("elemento.top() = " + elemento.top());
        elemento.imprimir();
        System.out.println("elemento.top() = " + elemento.top());
        elemento.imprimir();
        System.out.println("elemento.top() = " + elemento.top());
    }
}
