package Programacion1;

public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			final int TOPE =5;
			int i=0,j=0,auxiliar=0;
			int vector[] = {11, 8, 33, 14, 5};
			int vectorOriginal [] = {0,0,0,0,0};
			vectorOriginal =vector;
			System.out.println("El vector original es: ");
			for (i=0; i<vectorOriginal.length; i++) {
				System.out.println(" " + vectorOriginal[i]);
			}
			
				for(i=1; i<=TOPE; i++){
					for(j=0; j<TOPE-1; j++){
						if(vector[j]>vector[j+1]){ //si v[j] > v[j+1] intercambio. vector j =8  vector j+1=5
							auxiliar=vector[j+1]; // auxiliar= 5
							vector[j+1]=vector[j];// vector j+1 = 8
							vector[j]=auxiliar; // vector j = 5
						}
					} 
				
				}
			System.out.println("\n el vector ordenado es: ");
			for (i=0; i<vector.length; i++) {
				System.out.println(" " + vector[i]);
			}
			} 
}