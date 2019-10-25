package Javier.HashMap.Practica02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegJugadores {

    private static Scanner lector;
    private final HashMap<java.lang.String, ArrayList<java.lang.String>> jugadores;

    public RegJugadores() {
        jugadores = new HashMap<>();
        ArrayList<java.lang.String> a = new ArrayList<>();
        lector = new Scanner(System.in);
        a.add("Jonas");
        a.add("Fassbinder");
        a.add("PhilippHartmann@cuvox.de");
        jugadores.put("Oures1997", a);

        ArrayList<java.lang.String> b = new ArrayList<>();
        b.add("Philipp");
        b.add("Hartmann");
        b.add("PhilippHartmann@cuvox.de");
        jugadores.put("Purthe", b);

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

    public void listarRegistro() {
        jugadores.forEach((k, v) -> System.out.println("\uD83D\uDD11 Username|> " + k +
                "\n└\uD83D\uDCC1─────────┬─ Nombre|> " + v.get(0) +
                "\n\t\t\t├─ Apellido|> " + v.get(1) +
                "\n\t\t\t└─ Email|> " + v.get(2)));
    }

    public void cambiarValue() {
        do {
            System.out.println("Ingrese el 'usuario' para iniciar tramite. (Cambiar 'value')");
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
                listarRegistro();
            } else
                System.out.println("El usuario no existe.");
        } while (repetirProceso());
    }

    public void cambiarKey() {
        System.out.println("Ingrese el 'usuario' para iniciar tramite. (Cambiar 'key')");
        String llave = lector.nextLine();
        do {
            if (jugadores.containsKey(llave)) {
                ArrayList<String> auxRegistro = jugadores.get(llave);
                System.out.println("Ingrese la nueva llave para " + this.jugadores.remove(llave));
                this.jugadores.put(lector.nextLine(), auxRegistro);
                listarRegistro();
            } else
                System.out.println("El usuario no existe.");

        } while (repetirProceso());
    }

    private static boolean repetirProceso() {
        System.out.println("Desea repetir proceso? ");
        return lector.nextLine().toLowerCase().equals("s");
    }

}
