package Javier.Clases;

public class Cliente {

    private int[] butaca;
    private String tipo;

    public Cliente(int fila, int columna) {
        this.butaca[0] = fila;
        this.butaca[1] = columna;
    }


    public int[] getButaca() {
        return butaca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        switch (tipo){
            case 1: this.tipo = "Niño";
                break;
            case 2: this.tipo = "Adulto";
                break;
            case 3: this.tipo = "Jubilado";
                break;
            default: this.tipo = "Nulo";
                break;
        }
    }
}
