package Javier.Clases;

public class Sala {

    private String peliculaSala;
    private Cliente[][] butacaSala;
    private int disponibles;
    private int vendidos;
    private int recaudado;

    public Sala(String enNombrePelicula){
        this.peliculaSala = enNombrePelicula;
        this.butacaSala = new Cliente[5][4];
        this.disponibles = 20;
        this.vendidos = 0;
        this.recaudado = 0;
    }

    public boolean salaDisponible(){
        return !(disponibles == 0);
    }
    public void venderEntrada(Cliente cliente){
        if(salaDisponible()) {
            this.disponibles--;
            this.vendidos++;
            if(cliente.getTipo().equals("Niño"))
                this.recaudado += 15;
            else if(cliente.getTipo().equals("Adulto"))
                this.recaudado += 20;
            else
                this.recaudado += 18;
        }
    }

    public void mostrarBustacas() {
        for (int columna = 0; columna < 5 ; columna++){
            for (int fila = 0; fila < 4; fila++){
                if(butacaSala[columna][fila] == null)
                    System.out.print("\tDisponible [" + (columna + 1) + " : " + (fila + 1) + "]");
                else
                    System.out.print("\tNo disponible [" + (columna + 1) + " : " + (fila + 1) + "]");
            }
            System.out.println("\n");
        }
    }
    public int getRecaudado(){
        return this.recaudado;
    }

    public boolean butacaDisponible(int[] butaca) {
        return butacaSala[butaca[0]][butaca[1]] != null;
    }
}
