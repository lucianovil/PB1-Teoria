package Programacion1;

public class PruebaDoWhile { //evalua la condicion al final, se ejecuta al menos una vez

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=21;
		do {
			//el codigo dentro del do se imprime incluso si la condicion es falsa
			System.out.println("Valor de x: " + x);
			x--;
		}
		while (x>=20);
	}

}
