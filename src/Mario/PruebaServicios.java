package Mario;

import java.util.Scanner;

public class PruebaServicios {

    private static Scanner lector = new Scanner(System.in);
    private static DemoListaServicios elemento = new DemoListaServicios();

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		invertirNombre();
//		frecuenciaCadena();
        numerosImpares();
    }

    private static void invertirNombre() {
        String nombre = lector.nextLine();
        String[] nombreInvertido = elemento.invertirNombreArreglo(nombre);
        for (int puntero = 0; puntero <= nombreInvertido.length - 1; puntero++) {
            System.out.print(nombreInvertido[puntero]);
        }
    }

    private static void frecuenciaCadena() {
        System.out.println("\nIngrese un texto");
        String cadena = lector.nextLine();
        int[] cantidad = elemento.frecuenciaPalabras(cadena);

        for (int puntero = 0; puntero < cantidad.length; puntero++) {
            if (cantidad[puntero] != 0)
                System.out.println("Frecuencia de " + puntero + " : " + cantidad[puntero]);
        }
    }

    public static void numerosImpares() {
        int[] impares = new int[50];
        int indice = 0;
        for (int contador = 0; contador < 100; contador++) {
            if (esImpar(contador)) {
                impares[indice] = contador;
                indice++;
            }
        }
        for (int numero : impares) {
            System.out.println(numero);
        }
    }

    public static boolean esImpar(int numero) {
        return numero % 2 != 0; //Operador ternario
    }

}
