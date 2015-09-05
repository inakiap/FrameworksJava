package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import dao.DepartmentDAO;
import dao.EmpJDBCDAO;
import dominio.Departments;
import dominio.EmpleadoDTO;

@ManagedBean
@SessionScoped
public class Departamentos {
	
	//parte de departamento
	private List<Departments> lista;
	private int idDep; //id del departamento
	private List<dominio.EmpleadoDTO> listaEmpleados;

	public List<Departments> getLista() {
		return lista;
	}

	public void setLista(List<Departments> lista) {
		this.lista = lista;
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public List<dominio.EmpleadoDTO> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<dominio.EmpleadoDTO> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	//parte del empleado
	private int id; //del empleado
	private String nombre;
	private String apellido;
	private String email;
	
	
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
	
	
	@PostConstruct
	public void obtenerLIsta (){
		DepartmentDAO dDAO = new DepartmentDAO();
		this.lista = dDAO.leerDepartamentos();
	}
	
	public void mostrarTodos(){
		EmpJDBCDAO eDAO = new EmpJDBCDAO();
		this.listaEmpleados = eDAO.leerTodosEmpleados(this.idDep);	
	}
	
	public void init(){
		EmpJDBCDAO eDAO = new EmpJDBCDAO();
		
		if (0 != this.id){
			
			EmpleadoDTO e = eDAO.leerEmpleado(this.id);
			this.setNombre(e.getF_name());
			this.setApellido(e.getL_name());
			this.setEmail(e.getEmail());
		}
	}
	
}
