package Javier;

import java.util.Scanner;

class LunesSiete {
    private static final Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
//			PracticaDos();
        PracticaTres();
    }

    public static void PracticaUno() {
        System.out.println("Ingrese una palabra: ");
        String palabra = lector.next();

        for (int x = 0; x < palabra.length(); x++) {
            System.out.println(palabra.charAt(x));
        }
    }

    public static void PracticaDos() {
        int divisores = 0, comparador = 0;
        int numeroMayor = 0;

        for (int numero = 1; numero <= 11; numero++) {

            for (int divisor = 1; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0)
                    comparador++;
            }
            if (comparador >= divisores) {
                divisores = comparador;
                numeroMayor = numero;
            }
            comparador = 0;
        }

        System.out.println(numeroMayor);
    }

    private static void PracticaTres() {

        System.out.println("EXAMEN MATEMATICO AVANZADO");
        System.out.println("Resolver los siguientes problemas: ");

        boolean[] calificacion = new boolean[5];
        char[] operador = {'+', '-', '*', '/'};

        for (int intento = 0; intento < calificacion.length; intento++) {
            int[] numeros = getNumeros();
            int[] opcion = new int[calificacion.length - 1];

            for (int i = 0; i < opcion.length; i++) {
                opcion[i] = (int) (Math.random() * 4 + 1);
            }
            switch (numeros.length) {
                case 2:
                    System.out.print("\n => " + numeros[0] + " " + operador[0] + " " + numeros[1] + " = ");
                    calificacion[intento] = respuestasCase2(numeros, operador[0]);
                    break;
                case 3:
                    System.out.print("\n => " + numeros[0] + " " + operador[0] + " " + numeros[1] + " " + operador[1] + " "
                            + numeros[2] + " = ");
                    break;
                case 4:
                    System.out.print("\n => " + numeros[0] + " " + operador[0] + " " + numeros[1] + " " + operador[1] + " "
                            + numeros[2] + " " + operador[2] + " " + numeros[3] + " = ");
                    break;
            }

        }

        System.out.println("\nResultados: ");
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i])
                System.out.println("\nEjercicio " + (i + 1) + ": Correcto");
            else
                System.out.println("\nEjercicio " + (i + 1) + ": Incorrecto");
        }
    }

    private static boolean respuestasCase2(int[] numeros, char enOpcion) {
        int valor = lector.nextInt();
        switch (enOpcion) {
            case '+':
                return numeros[0] + numeros[1] == valor;
            case '-':
                return numeros[0] - numeros[1] == valor;
            case '*':
                return numeros[0] * numeros[1] == valor;
            case '/':
                return numeros[0] / numeros[1] == valor;
        }
        return false;
    }

    private static int[] getNumeros() {
        int cantidad = (int) (Math.random() * 3);
        int[] valores = new int[2 + cantidad];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 9 + 1);
        }
        return valores;
    }

    public static void contadorDado() {
        int acumulador = 0, contador = 0, turno;

        for (int x = 0; x < 5; x++) {
            turno = (int) (Math.random() * 6 + 1);
            System.out.println("Intento " + (contador + 1) + ": " + turno);
            acumulador += turno;
        }

        System.out.println("Este es la suma de los dados: " + acumulador);
    }
}
