package actions;
import com.opensymphony.xwork2.ActionSupport;


public class PersonaAction extends ActionSupport {
	
	private Persona persona = null;
	
	public String execute() throws Exception {
		
		persona = new Persona() ;
		return SUCCESS;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

//	public Persona getPersona(){
//		return p;
//	}
//	
//	public void setPersona(String nombre, int edad){
//		p.setEdad(edad);
//		p.setNombre(nombre);
//	}
	
	

}
