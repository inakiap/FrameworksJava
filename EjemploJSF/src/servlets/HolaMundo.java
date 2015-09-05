package servlets;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;

@ManagedBean //esto siginifica que JSF la instancia automáticamente
@RequestScoped //le asignas el requests como ámbito aunque por defecto (si no se pone nada) es también requests
public class HolaMundo {
	

	private String nombre;
	
	public HolaMundo()
	{
		nombre="Paquito";
	}

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int longuitud()
	{
		return this.nombre.length();
	}

}
