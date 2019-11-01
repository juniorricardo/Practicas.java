package CodeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

public class Kata {

    public static int duplicateCount(String text) {
        int cant = 0;
        int rCant = 0;
        text = text.toLowerCase();
        String aux = "";
        for (int i = 0; i < text.length(); i++) {
            if (!aux.contains(String.valueOf(text.charAt(i)))) {
                cant++;
                aux = aux.concat(String.valueOf(text.charAt(i)));
                for (int j = i + 1; j < text.length(); j++)
                    if (text.charAt(i) == text.charAt(j)) {
                        cant++;
                    }
                if (cant > rCant) {
                    rCant = cant;
                }
                cant = 0;
            }
        }
        return rCant;
    }

    public static String high(String s) {
        String[] alf = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] arreglo = s.split(" ");
        String sRetorno = "";
        int puntos = 0;
        int aux = 0;
        for(String palabra: arreglo){
            for(int i = 0; i < palabra.length() ; i++){
               aux += indiceDe(alf, palabra.charAt(i)) + 1;
            }if(puntos < aux){
                sRetorno = palabra;
                puntos = aux;
            }
            aux = 0;
        }
        return sRetorno;
    }
    public static int indiceDe(String[] lista,char c) {
        for (int indice = 0; indice < lista.length; indice++) {
            if (lista[indice].equals(String.valueOf(c)))
                return indice;
        } 
        return -1;
    }

    public static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }

    //prueba de indiceDe
    public static int valor(){
        String[] alf = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Scanner lector = new Scanner(System.in);
        while(true){
            char c = lector.nextLine().charAt(0);
            System.out.println((indiceDe(alf,c) + 1));
        }
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }



    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

}
