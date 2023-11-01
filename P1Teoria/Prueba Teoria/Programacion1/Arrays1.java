package Programacion1;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String valorIngresado = teclado.next();
		int numero [] = null;
		for (int i=0; i<valorIngresado.length(); i++) {
			numero [i] = (int) valorIngresado.charAt(i);
		}
	}

}
