package Programacion1;

public class Pruebaequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaUno= "Java";
		String cadenaDos= "java";
		String cadenaTres= "Java ";
		String cadenaCuatro= "Java";
		boolean valor1 = cadenaUno.equals(cadenaDos);
		System.out.println("Son iguales? " + valor1);
		boolean valor2 = cadenaUno.equals(cadenaTres);
		System.out.println("Son iguales? " + valor2);
		boolean valor3 = cadenaDos.equals(cadenaTres);
		System.out.println("Son iguales? " + valor3);
		boolean valor4 = cadenaUno.equals(cadenaCuatro);
		System.out.println("Son iguales? " + valor4);
		/*if(cadenaUno.equals(cadenaDos)); {
		System.out.println("Las cadenas son iguales");
		}
		else{ 
		System.out.println("las cadenas son distintas");
		}*/
	}

}
