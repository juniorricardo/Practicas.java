package Javier.Triangulo;

public class RandomPolinomio {

    private int grado;
    private String polinomio;

    public RandomPolinomio(int enGrado) {
        this.grado = enGrado;
        this.polinomio = "";
    }

    public void generar() {
        for (int i = this.grado; i >= 0; i--) {
            if(i == 0)
                this.polinomio = polinomio.concat(numero());
            else if(i == 1)
                this.polinomio = polinomio.concat(numero() + "x + " );
            else
                this.polinomio = polinomio.concat(numero() + "x^" + i + " + ");
        }
    }
    public String getPolinomio(){
        return this.polinomio;
    }

    public String[] calcular(){
        return polinomio.split(" ");
    }




    private static String numero() {
        return Integer.toString((int) (Math.random() * 10 + 1));
    }

}
