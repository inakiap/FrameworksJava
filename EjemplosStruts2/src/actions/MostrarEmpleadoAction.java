package actions;

import services.EmployeesServices;

import com.opensymphony.xwork2.ActionSupport;

import dao.EmployeesHibernateDAO;
import dto.Employees;


public class MostrarEmpleadoAction extends ActionSupport {
	
	private Employees empleado = null;
	private int id;
	

	@Override
	public String execute() throws Exception {
		EmployeesServices es = new EmployeesServices(new EmployeesHibernateDAO());
		empleado = es.leerEmpeladoService(this.id);
		return SUCCESS;
	}
	
	
	public Employees getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Employees empleado) {
		this.empleado = empleado;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}	
