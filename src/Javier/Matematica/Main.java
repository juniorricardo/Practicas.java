package Javier.Matematica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //trianguloCalculo();

        polinomio();

    }

    //>Polinomio<
    public static void polinomio(){
        RandomPolinomio dos = new RandomPolinomio(5);
        dos.generar();
        System.out.println("f(x) = " + dos.getPoligono());
        int variable = new Scanner(System.in).nextInt();
        System.out.println("Resultado del polinomio con \'x = " + variable + "' es : " + dos.resolver(variable));

    }

    //>Triangulo<
    public static void trianguloCalculo() {
        TrianguloIsoseles triangulo1 = new TrianguloIsoseles(8, 5);

        System.out.println("miTriangulo.calcularArea() = " + triangulo1.calcularArea());
        System.out.println("miTriangulo.calcularPerimetro() = " + triangulo1.calcularPerimetro());

        TrianguloIsoseles triangulo2 = new TrianguloIsoseles(11, 9);
        TrianguloIsoseles triangulo3 = new TrianguloIsoseles(3, 2);
        TrianguloIsoseles triangulo4 = new TrianguloIsoseles(4, 3);
        TrianguloIsoseles triangulo5 = new TrianguloIsoseles(5, 8);
        TrianguloIsoseles triangulo6 = new TrianguloIsoseles(44, 20);
        TrianguloIsoseles triangulo7 = new TrianguloIsoseles(7, 6);

        System.out.println("{Area}=> triangulo2 > triangulo4  = " + triangulo2.compararArea(triangulo4));
        System.out.println("{Perimetro}=> triangulo3 > triangulo4  = " + triangulo3.compararPerimetro(triangulo4));
        List<TrianguloIsoseles> miLista = new ArrayList<>();
        miLista.add(triangulo1);
        miLista.add(triangulo2);
        miLista.add(triangulo3);
        miLista.add(triangulo4);
        miLista.add(triangulo5);
        miLista.add(triangulo6);
        miLista.add(triangulo7);
        TrianguloIsoseles aux = new TrianguloIsoseles();

        buscarTrianguloMayor(miLista, aux);
    }
    private static void buscarTrianguloMayor(List<TrianguloIsoseles> lista, TrianguloIsoseles aux) {

        for (TrianguloIsoseles triangulo : lista) {
            if (triangulo.compararPerimetro(aux) && triangulo.compararArea(aux))
                aux = triangulo;
        }
        System.out.println("Mayor" + aux);
    }

}
