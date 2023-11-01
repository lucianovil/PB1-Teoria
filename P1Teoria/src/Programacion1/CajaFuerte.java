package Programacion1;

public class CajaFuerte {

	private int password;
	private boolean estaAbierta;
	
	public CajaFuerte () {
		this.password=1234;
		this.estaAbierta=false;
	}
	
	public CajaFuerte (int password) {
		this.password=password;
		this.estaAbierta=false;
	}
	
	public boolean abrir(int passwordIngresada) {
		if (passwordIngresada==this.password) {
			estaAbierta=true;
		}
		return estaAbierta;
	}

	public boolean verEstadoCajaFuerte () {
		return estaAbierta;
		
	}
	public void cerrar() {
	this.estaAbierta=false;
		
	}
}
