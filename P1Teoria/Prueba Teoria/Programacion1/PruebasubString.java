package Programacion1;

public class PruebasubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena= "caracteristicas";
		System.out.println(cadena);
		String subCadena = " ";
		System.out.println("la subcadena de cadena es " + cadena.substring(10));
		subCadena= cadena.substring(10);
		System.out.println("la subcadena de subCadena es " + subCadena.substring(2));
		
		System.out.println("la subcadena de cadena es " + cadena.substring(3, 7));
		System.out.println("la subcadena de subCadena es " + subCadena.substring(1, 3));
	}

}
