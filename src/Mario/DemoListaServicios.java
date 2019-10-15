package Mario;

class DemoListaServicios {

    private static int[][] tabla;
    private String[] nombre;

    DemoListaServicios() {
        tabla = new int[4][4];
    }

    public static void cargarTabla() {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (esCeldaPar(columna)) {
                    tabla[fila][columna] = obtenerPar();
                } else {
                    tabla[fila][columna] = obtenerImpar();
                }
            }
        }
    }

    private static boolean esCeldaPar(int columna) {
        return columna == 0 || columna == 2;
    }

    private static int obtenerPar() {
        int numero;
        do {
            numero = obtenerNumeroRandom();
        } while (numero % 2 != 0);
        return numero;
    }

    private static int obtenerImpar() {
        int numero;
        do {
            numero = obtenerNumeroRandom();
        } while (numero % 2 == 0);
        return numero;
    }

    private static int obtenerNumeroRandom() {
        return (int) (Math.random() * 100 + 1);
    }

    public String[] invertirNombreChar(String enNombre) {

        int aux = enNombre.length();
        for (int i = enNombre.length() - 1; i >= 0; i--)
            this.nombre[aux - i] = Character.toString(enNombre.charAt(i));
        return nombre;
    }

    public String[] invertirNombreArreglo(String enNombre) {
        int puntero = enNombre.length();

        String[] arregloNombre = enNombre.split("");
        this.nombre = new String[puntero];

        for (int i = enNombre.length() - 1; i >= 0; i--)
            this.nombre[i] = arregloNombre[(puntero - 1) - i];
        return this.nombre;
    }

    public int[] frecuenciaPalabras(String enOracion) {
        String[] frases = enOracion.split(" ");
        int[] frecuencias = new int[20];
        for (String frase : frases) {
            frecuencias[frase.length() - 1]++;
        }

        return frecuencias;
    }

    public int[][] getTabla() {
        return tabla;
    }

}
