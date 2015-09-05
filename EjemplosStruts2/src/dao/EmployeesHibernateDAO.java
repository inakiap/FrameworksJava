package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static logging.Registrar_Logs.*;

import conexion.SessionManager;
import dto.Employees;

public class EmployeesHibernateDAO {

	public Employees leerEmpleado(int idEmpleado) {
		SessionFactory sessionFactory = SessionManager.getSessionFactory();
		Session s = sessionFactory.openSession();
		Employees emp = null;
		Transaction transaction = null;
		try {
			transaction = s.beginTransaction();
			emp = (Employees) s.get(Employees.class, idEmpleado);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			SessionManager.cerrarSession(s);
		}
		return emp;
	}

}
