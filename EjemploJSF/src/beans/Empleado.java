package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.EmpJDBCDAO;
import dominio.EmpDetailsView;
import dominio.EmpleadoDTO;

@ManagedBean
@RequestScoped
public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private String email;
	
	private int idDep;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Empleado() {
		super();
	}
	
	//@PostConstruct
	public void init(){
		EmpJDBCDAO eDAO = new EmpJDBCDAO();
			EmpleadoDTO e = eDAO.leerEmpleado(this.id);
			this.setNombre(e.getF_name());
			this.setApellido(e.getL_name());
			this.setEmail(e.getEmail());
	}
	
	public void mostrarTodos(){
		EmpJDBCDAO eDAO = new EmpJDBCDAO();
		List<EmpleadoDTO> lista = eDAO.leerTodosEmpleados(this.idDep);	
	}
	
}
