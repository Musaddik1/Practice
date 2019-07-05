package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sessionfactory;
	public static SessionFactory getsSessionFactory()
	{
		sessionfactory=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		
		return sessionfactory;
	}
}
