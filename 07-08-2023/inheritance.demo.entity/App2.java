package inheritance.demo.entitty;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.hibernateDemo.HibernateUtil;

public class App2 {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		
SalariedEmployee se = new SalariedEmployee(101,"ajay",15000);
HourlyWagesEmployee hwe = new HourlyWagesEmployee(102,"dinesh",45,500);
	Transaction trans = session.beginTransaction();
	session.save(se);
	session.save(hwe);
	trans.commit();
	session.close();
	HibernateUtil.shutdown();
	
	}
	

}
