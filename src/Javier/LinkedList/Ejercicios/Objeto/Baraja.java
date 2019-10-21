package Javier.LinkedList.Ejercicios.Objeto;

import java.util.*;
public class Baraja
{
    // constantes estáticas
    private static String[] palo={"Bastos", "Copas", "Oros", "Espadas"};

    private static String[] carta={"As", "Dos", "Tres", "Cuatro", "Cinco","Seis", "Siete", "Sota", "Caballo","Rey"};

    // la baraja es una lista de cartas
    private ArrayList<String> mazo;

    /**
     * Constructor de la baraja
     */
    public Baraja()
    {
        mazo= new ArrayList<String>(40);
        for (String p: palo) {
            for (String c: carta) {
                mazo.add(c+" de "+p);
            }
        }
    }

    /**
     * Repartir num cartas
     */
    public List<String> repartir(int num)
    {

        int numCartas=mazo.size();
        List<String> vistaDeMano = mazo.subList(numCartas - num,numCartas);
        List<String> mano = new ArrayList<String>(vistaDeMano);
        vistaDeMano.clear();
        return mano;
    }
}