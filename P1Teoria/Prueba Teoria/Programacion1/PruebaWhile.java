package Programacion1;

public class PruebaWhile { // evalua la condicion al principio, while puede no ejecutarse.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		
		//Salir cuando x llega a ser mayor que 4
		while (x<=4) {
			System.out.println("Valor de x: " + x);
			
			//incrementa el valor de x para la siguiente iteracion
			x++;
		}
	}

}
