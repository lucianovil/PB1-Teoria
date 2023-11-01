package Programacion1;
import java.util.Scanner;

public class PruebaEjercicioWhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola= new Scanner (System.in);
		//Ejercicio A
		char deseaContinuar=0;
		char si;
		while (deseaContinuar==0) {
			System.out.println("Desea continuar?: marque si para continuar, marque no para salir ");
			deseaContinuar= consola.nextLine().charAt(0);
		}
		System.out.println("Usted ha salido del menu principal");//no funciona correctamente
	}

}
