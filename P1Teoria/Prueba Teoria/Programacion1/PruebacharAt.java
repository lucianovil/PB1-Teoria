package Programacion1;

public class PruebacharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "cadena";
		
		System.out.println("el caracter en la posicion 3 es: " + palabra.charAt(3));
		
		String s1 = "This is String CharAt Method";
	     //returns the char value at the 0 index
	     System.out.println("Character at 0 position is: " + s1.charAt(0));
	     //returns the char value at the 5th index
	     System.out.println("Character at 5th position is: " + s1.charAt(5));
	     //returns the char value at the 22nd index
	     System.out.println("Character at 22nd position is: " + s1.charAt(22));
	     //returns the char value at the 23th index
	     char result = s1.charAt(23);
	     System.out.println("Character at 23th position is: " + result);
	}

}
