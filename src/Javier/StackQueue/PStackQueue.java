package Javier.StackQueue;

public class PStackQueue {

    public static void main(String[] args) {

        correrStack();




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
