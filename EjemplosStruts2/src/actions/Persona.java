package actions;

public class Persona {

	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona(){
		
	}
	
	@Override
	public String toString() {
		return "Persona [Nombre = " + nombre + ", Edad = " + edad + "]";
	}
	
}
