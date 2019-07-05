package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;

public class Test {

	
	public static void main(String[] args) {
		
		SessionFactory sessionfactory=HibernateUtil.getsSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		User user=session.get(User.class, "Musaddik");
		
		System.out.println(user.getMobile());
		transaction.commit();
		session.close();
	}
}
