package Mario;

class EvaluacionDolar {

    private float valorEuro;
    private float valorDolar;
    private float porcentajeEuro;
    private float[][] mes;

    public EvaluacionDolar(float valorDolar, float valorEuro) {
        super();
        this.valorEuro = valorEuro;
        this.valorDolar = valorDolar;
        this.mes = new float[4][5];
    }

    public float getPorcentajeEuro() {
        return porcentajeEuro;
    }

    public void setPorcentajeEuro(float porcentajeEuro) {
        this.porcentajeEuro = porcentajeEuro;
    }

    public float getValorEuro() {
        return valorEuro;
    }

    public void setValorEuro(float valorEuro) {
        this.valorEuro = valorEuro;
    }

    public float getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(float valorDolar) {
        this.valorDolar = valorDolar;
    }

    public void incrementoDolar() {
        setPorcentajeEuro(this.valorEuro / 4);
    }

    public void evaluarDolar() {
        int contador = 0;

        for (int fila = 0; fila < mes.length; fila++) {
            for (int columna = 0; columna < mes[0].length; columna++) {
                if (contador < 3) {
                    mes[fila][columna] = getValorDolar();
                    contador++;
                } else {
                    setValorDolar(this.valorDolar + getPorcentajeEuro());
                    mes[fila][columna] = getValorDolar();
                    contador = 0;
                }
            }
        }
    }

    public void mostrarMesColSemana() {

        System.out.println("Semanas:\n     [ 1 ]\t    [ 2 ]\t    [ 3 ]\t    [ 4 ]");
        for (int columna = 0; columna < 4; columna++) {
            for (int fila = 0; fila < 4; fila++) {
                System.out.print("|   $" + String.format("%.2f", mes[fila][columna]) + "\t");
            }
            System.out.println();
        }
    }

    public void mostrarMesFilaSemana() {
        int cont = 1;
        for (int fila = 0; fila < mes.length; fila++) {
            System.out.println("* Semana: " + (fila + 1));
            for (int columna = 0; columna < mes[0].length; columna++) {
                System.out.print("Dia " + cont + ": $" + String.format("%.2f", mes[fila][columna]) + " | ");
                cont++;
            }
            System.out.println();
            System.out.println();
        }
    }
}
