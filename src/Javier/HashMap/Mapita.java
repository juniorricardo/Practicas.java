package Javier.HashMap;

import java.util.HashMap;
public class Mapita {


    public static void main(String[] args) {

        HashMap<String,String> mapa = new HashMap<String,String>();

        mapa.put("23","elemento");
        mapa.put("85","metal");
        mapa.put("29","dia");
        mapa.put("47", "hola");

        mapa.forEach((k,v)->System.out.println("Item : " + k + " Cosa : " + v));

    }

}
