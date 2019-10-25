package Javier.HashMap.Practica02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegJugadores {

    private HashMap<java.lang.String, ArrayList<java.lang.String>> jugadores = new HashMap<>();
    private Scanner lector;

    public RegJugadores() {
        ArrayList<java.lang.String> a = new ArrayList<>();
        lector = new Scanner(System.in);
        a.add("Jonas");
        a.add("Fassbinder");
        a.add("PhilippHartmann@cuvox.de");
        jugadores.put("Oures1997", a);

        ArrayList<java.lang.String> b = new ArrayList<>();
        a.add("Philipp");
        a.add("Hartmann");
        a.add("PhilippHartmann@cuvox.de");
        jugadores.put("Purthe", a);

        ArrayList<java.lang.String> c = new ArrayList<>();
        c.add("Michelle");
        c.add("Reinhard");
        c.add("MichelleReinhard@armyspy.com");
        jugadores.put("Crast1998", c);

        ArrayList<java.lang.String> d = new ArrayList<>();
        d.add("Claudia");
        d.add("Bürger");
        d.add("ClaudiaBurger@gustr.com");
        jugadores.put("Thummed", d);
    }

    public void listaRegistro() {
        jugadores.forEach((k, v) -> System.out.println("Username: " + k +
                "\n\tDatos personales" +
                "\n\t\tNombre: " + v.get(0) +
                "\n\t\tApellido: " + v.get(1) +
                "\n\t\tEmail: " + v.get(2)));
    }

    public void cambiarRegValor() {
        System.out.println("Ingrese el 'usuario' para iniciar tramite.");
        String llave = lector.nextLine();
        if (jugadores.containsKey(llave)) {
            ArrayList<String> cambiarReg = jugadores.get(llave);
            System.out.println("Ingrese el dato que desea cambiar:");
            switch (lector.nextLine()) {
                case "nombre":
                    System.out.println("Ingrese nuevo 'nombre':");
                    cambiarReg.set(0, lector.nextLine());
                    jugadores.replace(llave, cambiarReg);
                    break;
                case "apellido":
                    System.out.println("Ingrese nuevo 'apellido':");
                    cambiarReg.set(1, lector.nextLine());
                    jugadores.replace(llave, cambiarReg);
                    break;
                case "email":
                    System.out.println("Ingrese nuevo 'email':");
                    cambiarReg.set(2, lector.nextLine());
                    jugadores.replace(llave, cambiarReg);
                    break;
                default:
                    System.out.println("Opcion invalidad, saliendo...");
                    break;
            }
        } else
            System.out.println("El usuario no existe.");
        listaRegistro();
    }

    public void cambiarRegLlave(){
        System.out.println("Ingrese el 'usuario' para iniciar tramite.");
        String llave = lector.nextLine();
        if (jugadores.containsKey(llave)) {
            ArrayList<String> cambiarReg = jugadores.get(llave);

        } else
            System.out.println("El usuario no existe.");
        listaRegistro();
    }
}
