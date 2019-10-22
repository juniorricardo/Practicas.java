package Javier.HashMap;

public class PruebaHM {
    public static void main(String[] args) {
        PracticaHashMap elemento = new PracticaHashMap();

        elemento.cargarDiccionario();
        System.out.println("elemento.getCantidad() = " + elemento.getCantidad());

        System.out.println("[elemento.buscar(\"Resiliencia\")]\n" + elemento.buscar("Resiliencia"));

        elemento.replace("Perplejo","NO EXISTE");
        elemento.imprimirDic();

    }
}
