package Programacion1;

import java.util.Scanner;

public class pruebaSwitch {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char semaforo = 0;

		System.out.println("Ingrese el estado del semaforo:");
		semaforo = teclado.next().charAt(0);
		switch (semaforo) {
		case 'R':
		case 'r':
			System.out.println("el semaforo esta en rojo, detengase");
			break;

		case 'A':
		case 'a':
			System.out.println("el semaforo esta en amarillo, precaucion");
			break;

		case 'V':
		case 'v':
			System.out.println("El semaforo esta en verde, avance");
			break;

		default:
			System.out.println("Opcion incorrecta, elija una tecla valida");
		}
	}

}
