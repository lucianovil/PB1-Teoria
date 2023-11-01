package Programacion1;

import java.util.Scanner;

public class PruebaCajaFuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		CajaFuerte CajaF = new CajaFuerte();
		CajaFuerte CajaG = new CajaFuerte();
		CajaFuerte CajaH = new CajaFuerte(4321);

		System.out.println("ingrese la contrasenia para crear una cf");
		int passwordParaCrear = teclado.nextInt();
		CajaFuerte CajaI = new CajaFuerte(passwordParaCrear);

		System.out.println("ingrese la contrasenia");
		int passwordIngresada = teclado.nextInt();
		boolean abrioLaCajaFuerte = CajaF.abrir(passwordIngresada);

		if (abrioLaCajaFuerte == true) {
			System.out.println("la caja fuerte esta abierta");
		} else {
			System.out.println("la caja fuerte esta cerrada");
		}
		
		System.out.println("cierro la caja");
		CajaF.cerrar();
		
		if (CajaF.verEstadoCajaFuerte() == true) {
			System.out.println("La caja esta abierta");
		}
			else {
				System.out.println("La caja esta cerrada");
			}
		
	}

}
