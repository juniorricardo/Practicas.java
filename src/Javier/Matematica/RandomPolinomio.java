package Javier.Matematica;

public class RandomPolinomio {

    private String cadena;
    private final int[] polinomio;

    public RandomPolinomio(int grado) {
        polinomio = new int[grado + 1];
        this.cadena = "";
    }

    public void generar() {
        int len = polinomio.length - 1;
        for (int indice = 0; indice <= len; indice++){

            polinomio[indice] = (int)(Math.random() * 10 + 1);

            if (indice == len)
                this.cadena = this.cadena.concat("(" + this.polinomio[indice] + ")");
            else if (indice == len - 1)
                this.cadena = this.cadena.concat("(" + this.polinomio[indice] + "x) + ");
            else
                this.cadena = this.cadena.concat("(" + this.polinomio[indice] + "x^" + (len - indice) + ") + ");
        }
    }

    public float resolver(int x) {
        float resultado = 0;
        int len = this.polinomio.length - 1;
        for (int indice = 0; indice <= len; indice++) {
            if (indice == len)
                resultado = resultado + polinomio[indice];
            else if (indice == len - 1)
                resultado = (resultado + (polinomio[indice] * x));
            else
                resultado = (float) (resultado + (polinomio[indice] * (Math.pow(x, len - indice))));
        }
        return resultado;
    }

    public String getPoligono(){
        return this.cadena;
    }

}
