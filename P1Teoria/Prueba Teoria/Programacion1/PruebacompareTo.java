package Programacion1;

public class PruebacompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaUno= "Java";
		String cadenaDos= "java";
		String cadenaTres= "JaVa ";
		String cadenaCuatro= "JAVa";
		String cadenaCinco= "Java";
		System.out.println("Las cadenas son " + cadenaUno.compareTo(cadenaDos));
		System.out.println("Las cadenas son " + cadenaUno.compareTo(cadenaTres));
		System.out.println("Las cadenas son " + cadenaUno.compareTo(cadenaCuatro));
		System.out.println("Las cadenas son " + cadenaUno.compareTo(cadenaCinco));
		System.out.println("Las cadenas son " + cadenaDos.compareTo(cadenaTres));
	}

}
