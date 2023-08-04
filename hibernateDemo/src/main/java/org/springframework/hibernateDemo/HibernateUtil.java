package org.springframework.hibernateDemo;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.*;

public class HibernateUtil {
private static SessionFactory sessionFactory = buildSessionFactory() ; 
public static SessionFactory buildSessionFactory()
{
	try {
		if(sessionFactory ==null)
		{
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metaData = new MetadataSources(standardRegistry)
					.getMetadataBuilder()
					.build();
			sessionFactory = metaData.getSessionFactoryBuilder().build();
			
		}
	
	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return sessionFactory;
	
}
public static SessionFactory getSessionFactory() {
	return sessionFactory;
}
public static void shutdown() {
	if(sessionFactory != null)
		sessionFactory.close();
	
}
}
