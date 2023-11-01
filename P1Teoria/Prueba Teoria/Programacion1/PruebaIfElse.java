package Programacion1; 

import Programacion1.Personal;

public class PruebaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  Personal juan;
		  Personal gemelo;
		  
		  juan= new Personal("Juan", "Masculino", 282828282, 80.5, 1.90, 27, true);
		  gemelo = new Personal ("Juan", "Masculino", 282828282, 80.5, 1.90, 27, true);
		  gemelo = juan;
		  
		  if (juan==gemelo ) {
			  System.out.println("Juan y Gemelo son iguales");
		  }
		  else {
			  System.out.println("Juan y Gemelo son distintos");
		  }
		  
	}

}
