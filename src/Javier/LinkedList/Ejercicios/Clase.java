package Javier.LinkedList.Ejercicios;

public class Clase
{
    public static void main (String[] args)
    {
//Atributos
        GestionReparaciones taller = new GestionReparaciones();
        String matricula1="12345";
        String modelo1="Leon";

        String matricula2="54321";
        String modelo2="Mondeo";

        String matricula3="67890";
        String modelo3="Laguna";

//Añado dos vehiculos al taller
        taller.anadeVehiculo(modelo1, matricula1);
        taller.anadeVehiculo(modelo2, matricula2);

//Voy a fijar una fecha de reparacion a un vehiculo que no existe en el taller, dara error
        taller.reparado(matricula3);

//Este funcionara bien
        taller.reparado(matricula1);

//Este dará error, no esta reparado, por lo que no puede salir, es una condicion que hemos puesto en el if
        taller.fechaSalidaTaller(matricula2);

    }
}
