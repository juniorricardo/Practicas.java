package Javier;

public class Vehiculo {
    private String marca;
    private int velocidad;
    private int kilometros;

    Vehiculo(int enKilometro, int enVelocidad, String enMarca) {
        velocidad = enVelocidad;
        kilometros = enKilometro;
        marca = enMarca;
    }

    int getVelocidad() {
        return velocidad;
    }

    int getKilometros() {
        return kilometros;
    }

    String getMarca() {
        return marca;
    }

}
