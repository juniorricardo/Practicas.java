package Javier.Matematica;

public class TrianguloIsoseles {

    private float lado;
    private float base;
    private float altura;

    public TrianguloIsoseles(float enLado, float enBase) {
        this.lado = enLado;
        this.base = enBase;
        this.altura = (float) (Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2) / 4)));
    }

    public TrianguloIsoseles() {
    }

    public float calcularArea() {
        return (this.base * this.altura) / 2;
    }

    public float calcularPerimetro() {
        return (this.lado) * 3;
    }

    public boolean compararPerimetro(TrianguloIsoseles triangulo) {
        return calcularPerimetro() > triangulo.calcularPerimetro();
    }

    public boolean compararArea(TrianguloIsoseles triangulo) {
        return calcularArea() > triangulo.calcularArea();
    }

    @Override
    public String toString() {
        return "Triangulo: \n\t\tLado A: " + this.lado +
                "\n\t\tLado B: " + this.lado +
                "\n\t\tBase: " + this.base;
    }


}
