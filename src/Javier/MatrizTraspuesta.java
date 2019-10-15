package Javier;

class MatrizTraspuesta {

    private static int[][] matriz;
    private static int[][] matrizTraspuesta;

    public MatrizTraspuesta(int tam) {
        matriz = new int[tam][tam];
        matrizTraspuesta = new int[tam][tam];
    }

    private static int getNumero() {
        return (int) (Math.random() * 10);
    }

    public void cargarMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++)
                matriz[fila][columna] = getNumero();
        }
    }

    public void trasponerMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++)
                matrizTraspuesta[columna][fila] = matriz[fila][columna];
        }
    }

    public void imprimirMatriz() {
        System.out.println("Matriz:");
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++)
                System.out.print(ints[j] + "   ");
            System.out.println();
        }
    }

    public void imprimirMatrizTraspuesta() {
        System.out.println("Matriz traspuesta:");
        for (int[] ints : matrizTraspuesta) {
            for (int j = 0; j < matrizTraspuesta.length; j++)
                System.out.print(ints[j] + "   ");
            System.out.println();
        }
    }

    public void imprimirMatrizAmbas() {
        System.out.println("Matriz\t\t\tMatriz tranpuesta");
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta.length; j++)
                System.out.print(matrizTraspuesta[i][j] + "   ");
            System.out.print("\t");
            for (int x = 0; x < matriz.length; x++)
                System.out.print(matriz[i][x] + "   ");
            System.out.println();
        }
    }
}
