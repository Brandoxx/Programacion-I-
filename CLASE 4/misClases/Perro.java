package misClases;

public class Perro {
	
	private String raza;
	private int edad; 
	private String  nombre;
	
	
	
public Perro(String nuevonombre) {
	
	edad = 0;
nombre= nuevonombre;
	
}
	
	public String getNombre()  {
		return nombre;
	}
	
	public void setNombre(String nombreNuevo) {
		nombre=nombreNuevo;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String razaNueva) {
		raza= razaNueva;
	}
	
	public int getEdad()  {
		return edad;
	}
	
	public void setEdad(int edadNueva)  {
		edad= edadNueva;
	}
}


