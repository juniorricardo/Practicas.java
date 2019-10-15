package Javier;

public class Prueba {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
		//metodos para invertir matriz
		/*MatrizTraspuesta element = new MatrizTraspuesta(4);
		element.cargarMatriz();
		System.out.println();
		
		element.trasponerMatriz();
		element.imprimirMatrizAmbas();
		*/

		
		//ordenar y mostrar matriz
		OrdenarArreglo prueba = new OrdenarArreglo();
		prueba.cargarArreglo();
		prueba.imprimirArreglo();
		System.out.println("");
		prueba.ordenarArreglo();
		prueba.imprimirArreglo();


        NuevaMatrizTraspuesta nuevo = new NuevaMatrizTraspuesta();
        nuevo.cargarMatriz();
        nuevo.imprimirMatriz();
        System.out.println();
        nuevo.iniciarOperacion();
        nuevo.imprimirMatriz();
    }

}
