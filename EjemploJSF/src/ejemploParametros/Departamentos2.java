package ejemploParametros;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct; //las clases anotadas con esta ruta (annotation), son anotaciones gestionadas por las propias librerias del Contenedor Tomcat
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean; //las clases anotadas con esta ruta, (faces.bean) son anotaciones gestionadas por las propias librerias de JSF
import javax.faces.bean.ManagedProperty;//NO MEZCLAR, ojo
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import dominio.Departments;
import dao.DepartmentDAO;

@ManagedBean
@SessionScoped
public class Departamentos2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5984900623587893508L;

	@ManagedProperty (value = "#{departmentDAO}") //con esta anotación se está diciendo que esta propiedad se inicialice.
	private DepartmentDAO departmentDAO;
	
	private List<Departments> listaDepartamentos;
	
	private String selected;
	
	
	public DepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public Departamentos2() {
	}
	
	@PostConstruct
	
	public void init ()
	{
		departmentDAO = new DepartmentDAO();
		System.out.println("El contenedor me ha instanciado");
		listaDepartamentos = departmentDAO.leerDepartamentos(); //departamentServices es ya un objeto instanciado, gracias a que indiqu� que era una @ManagedProperty (y a su vez, un managed bean)
	}

	@PreDestroy
	public void destroy ()
	{
		System.out.println("El contenedor me elimina");
	}

	public List<Departments> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departments> lista_departamentos) {
		this.listaDepartamentos = lista_departamentos;
	}
	
	public String actionEmpleados ()
	{
		//FacesContext.getCurrentInstance().getExternalContext().getFlash().put("id", selected); //esto tambi�n funcionar�a ;)
		HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		req.setAttribute("id", selected);
		return "empleados";
	}
	
}
