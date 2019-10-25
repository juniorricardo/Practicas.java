package Javier.HashMap;

import java.util.HashMap;

public class PracticaHashMap{

    private final HashMap<String, String> diccionario = new HashMap<>();
    private int cantidad;

    public void cargarDiccionario(){
        diccionario.put("Resiliencia","En psicología, capacidad que tiene una persona para superar circunstancias traumáticas como la muerte de un ser querido, un accidente, etc.");
        diccionario.put("Sarcasmo", "Dicho irónico y cruel con que se ridiculiza, humilla o insulta.");
        diccionario.put("Perplejo","Que está confuso y desconcertado y no sabe lo que debe hacer, pensar o decir.");
        this.cantidad = this.diccionario.size();
        imprimirDic();
        diccionario.replace("Resiliencia","es un término que deriva del verbo en latín resilio, resilire, que significa \"saltar hacia atrás, rebotar\".");
        imprimirDic();
    }

    public String buscar(String valor){
        return this.diccionario.get(valor);
    }

    private void imprimirDic(){
        /*for (String i : diccionario.keySet())
            System.out.println("# " + i + ": \n\t" + diccionario.get(i));*/
        diccionario.forEach((k,v)->System.out.println("# " + k + ": " + v));
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void reemplazar(String key, String value){
        this.diccionario.replace(key,value);
    }

}
