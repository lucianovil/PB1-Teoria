package Programacion1;

public class Personal {

	//Atributos
		private String nombre;
		private String genero;
		private long dni;
		private double peso;
		private double altura;
		private int edad;
		private boolean viva;
		
		//Constructor
		public Personal (String nombre, String genero, long dni, double peso, double altura, int edad, boolean viva) {
		this.nombre=nombre;
		this.genero= genero;
		this.dni= dni;
		this.peso= peso;
		this.altura=altura;
		this.edad=edad;
		this.viva=viva;
		}
		
		//Metodos. Get y Set actualizar o cambiar el dato
		//Nombre
		public void setNombre (String nombre) {
			this.nombre =nombre;
		}
		public String getNombre () {
			return nombre;
		}
		//Genero
		public void setGenero (String genero) {
			this.genero =genero;
		}
		public String getGenero () {
			return genero;
		}
		//DNI
		public void setDNI (Long dni) {
			this.dni =dni;
		}
		public Long getDNI () {
			return dni;
		}
		//peso
		public void setPeso (Double peso) {
			this.peso =peso;
		}
		public double getPeso () {
			return peso;
		}
		//altura
		public void setAltura (Double altura) {
			this.altura =altura;
		}
		public double getAltura () {
			return altura;
		}
		//edad
		public void setEdad (int edad) {
			this.edad =edad;
		}
		public int getEdad () {
			return edad;
		}
		//viva
		public void setViva (boolean viva) {
			this.viva =true;
		}
		public boolean getViva () {
			return true;
		}
		//metodo alimentar
		public void alimentar(double kilos) {
			this.peso += kilos; // o poner this.peso = this.peso + kilos
		}
		// metodo crecer
		public void crecer(double cm) {
				this.altura += cm;
		}
		//metodo cumplir anios
		public void cumpliranios(int anios) {
					this.edad += anios;
		}
}
