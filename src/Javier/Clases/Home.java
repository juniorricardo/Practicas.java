package Javier.Clases;

import java.util.Scanner;

public class Home {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {

        Sala pelicula1 = new Sala("Pelicula 1");
        Sala pelicula2 = new Sala("Pelicula 2");
        Sala pelicula3 = new Sala("Pelicula 3");
        do {
            System.out.println("\t- Menu - \n¿Que pelicula deseas ver?");
            System.out.println("pelicula 1");
            System.out.println("pelicula 2");
            System.out.println("pelicula 3");
            switch (lector.nextLine()){
                case "1":
                    if(pelicula1.salaDisponible()){
                        pelicula1.mostrarBustacas();
                        do{
                            System.out.print("Elija butaca: ");
                            Cliente cliente = new Cliente(lector.nextInt(),lector.nextInt());
                            if(pelicula1.butacaDisponible(cliente.getButaca())) {
                                cliente.setTipo(getTipoCliente());

                            }else
                                System.out.println("Butaca no disponible");

                        }while(repetirProceso());
                    }
                    else
                        System.out.println("No quedan butacas disponibles!");
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    break;
            }
        }while(repetirProceso());

    }

    private static int getTipoCliente() {
        System.out.println("Categoria?\n1-> niño\n2-> adulto\n3-> jubilado");
        return lector.nextInt();
    }

    public static boolean repetirProceso(){
        System.out.println("Desea repetir el proceso? (s/n)");
        return (lector.nextLine() == "s") ? true : false ;
    }
}
