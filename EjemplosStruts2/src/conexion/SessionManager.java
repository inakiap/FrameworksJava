package conexion;

import logging.Registrar_Logs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Esta clase carga la configuraci�n de hibernate, adem�s gestiona las sessiones
 * y la sessionFactory.
 * 
 * @author Juanjors
 */

public class SessionManager {

	private static SessionFactory sessionFactory = null;

	/**
	 * Este 'm�todo' se ejecuta cuando alguna referencia de esta clase es
	 * llamada desde cualquier otro sitio del programa Carga la configuraci�n
	 * del archivo hibernate.cfg.xml y lo asigna a sesionFactory
	 */
	static {
	    try{
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
		Registrar_Logs.log.trace("Configuraci�n cargada");
	    }catch(Exception e){
		e.printStackTrace();
		Registrar_Logs.log.trace("La configuraci�n no se ha podido cargar");
	    }
	}

	/**
	 * Devolvemos una Session de Hibernate abierta
	 * 
	 * @return Session (Una session abierta)
	 */
	public static Session getNewSesion() {
		return sessionFactory.openSession();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Este m�todo cierra la Sessi�nFactory (Se debe ejectuar al finalizar la
	 * aplicaci�n).
	 * 
	 * @return boolean si se cierra o no correctamente.
	 */

	public static boolean cerrarFactory() {
		boolean ok = false;
		try {
			sessionFactory.close();
			ok = true;
		} catch (Exception e) {
			Registrar_Logs.log.error("Error al cerrar Factory");
			ok = false;
			e.printStackTrace();
		}
		return ok;
	}

	/**
	 * Cierra la Session parametrizada.
	 * 
	 * @param Session
	 * @return boolean si se cierra o no correctamente.
	 */
	public static boolean cerrarSession(Session s) {
		boolean ok = false;
		try {
			s.close();
			ok = true;
		} catch (Exception e) {
			e.printStackTrace();
			Registrar_Logs.log.error("Error al cerrar Session");
		}
		return ok;
	}

}