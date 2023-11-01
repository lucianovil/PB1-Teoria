package Programacion1;

public class Casteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		byte k;
		int p=400;
		double d=34.6;
		
		c= (char)d;
		k= (byte)p;
		
		System.out.println("La conversion explicita de double a char es: " + c);
		System.out.println("La conversion explicita de int a byte es : " + k);
	}

}
