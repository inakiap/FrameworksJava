package services;

import dao.EmployeesHibernateDAO;
import dto.Employees;

public class EmployeesServices {

	private EmployeesHibernateDAO dao;
	
	public EmployeesServices(EmployeesHibernateDAO dao){
		this.dao = dao;
	}

	public Employees leerEmpeladoService(int numeroEmpleado) {
		return this.dao.leerEmpleado(numeroEmpleado);
	}

}