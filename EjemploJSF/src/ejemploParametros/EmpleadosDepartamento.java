package ejemploParametros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct; //las clases anotadas con esta ruta (annotation), son anotaciones gestionadas por las propias librerias del Contenedor Tomcat
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean; //las clases anotadas con esta ruta, (faces.bean) son anotaciones gestionadas por las propias librerias de JSF
import javax.faces.bean.ManagedProperty;//NO MEZCLAR, ojo
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import dominio.Departments;
import dominio.EmpleadoDTO;
import dao.DepartmentDAO;
import dao.EmpJDBCDAO;

@ManagedBean
@RequestScoped
public class EmpleadosDepartamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1829532287246916283L;

	@ManagedProperty (value = "#{id}")
	private String id;
	
	private List<EmpleadoDTO> listaEmpleados;


	
	private int posicionDepartamento (int id_departamento_buscado, List<Departments> lista_departamentos)
	{
		int n = -1;
		boolean encontrado = false;
		int longuitud = lista_departamentos.size();
		int posicion_actual = 0;
		
		while ((posicion_actual<longuitud)&&(!encontrado))
		{
			if ((lista_departamentos.get(posicion_actual).getDepartmentId()==id_departamento_buscado))
				{
					encontrado=true;
					n=posicion_actual;
				}
			else
				{
					posicion_actual++;
				}
		}
		
		return n;
		
	}
	
	public List<EmpleadoDTO> deSetALista (Set<EmpleadoDTO> conjunto_empleados)
	{
		List<EmpleadoDTO> l_dev = null;
		EmpleadoDTO empleado_actual = null;
		Iterator<EmpleadoDTO> it = conjunto_empleados.iterator();
		
		l_dev = new ArrayList<EmpleadoDTO>(conjunto_empleados.size());
		while (it.hasNext())
		{
			empleado_actual = it.next();
			l_dev.add(empleado_actual);
			
		}
		
		return l_dev;
	}
	
	public void init ()
	{
		System.out.println("Me llaman e id vale = " +id);
		EmpJDBCDAO es = new EmpJDBCDAO();
		
		/*Departamentos dptos = (Departamentos)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("departamentos");
		List<Departments> lista_departamentos = dptos.getListaDepartamentos();
		int pos_depto_seleccionado = posicionDepartamento(id_departamento, lista_departamentos);
		conjuntoEmpleados = lista_departamentos.get(pos_depto_seleccionado).getEmployeeses();
		listaEmpleados = deSetALista(conjuntoEmpleados);*/
		listaEmpleados = es.leerTodosEmpleados(Integer.parseInt(id));
		
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<EmpleadoDTO> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<EmpleadoDTO> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
}
