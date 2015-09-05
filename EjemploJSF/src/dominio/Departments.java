package dominio;
// default package
// Generated 09-jun-2015 15:28:25 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Departments generated by hbm2java
 */

public class Departments implements java.io.Serializable {

	private short departmentId;
	private Locations locations;
	private Employees employees;
	private String departmentName;
	private Set employeeses = new HashSet(0);
	private Set jobHistories = new HashSet(0);

	public Departments() {
	}

	public Departments(short departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Departments(short departmentId, Locations locations,
			Employees employees, String departmentName, Set employeeses,
			Set jobHistories) {
		this.departmentId = departmentId;
		this.locations = locations;
		this.employees = employees;
		this.departmentName = departmentName;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	public short getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(short departmentId) {
		this.departmentId = departmentId;
	}

	public Locations getLocations() {
		return this.locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set getEmployeeses() {
		return this.employeeses;
	}


	public void setEmployeeses(Set employeeses) {
		this.employeeses = employeeses;
	}

	public Set getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set jobHistories) {
		this.jobHistories = jobHistories;
	}

	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId
				+ ", departmentName=" + departmentName + "]";
	}
	
}
