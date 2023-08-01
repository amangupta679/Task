package com.amang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map.Entry;



public class App 


   {
	
	
	public static void main(String[] args) {
		
	//	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		
AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		Person p = container.getBean(Person.class);

        System.out.println(p.getSsn()+"   "+p.getName()+"   "+p.getAge());

        System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreetName());

        System.out.println((p.getAddress().getCity()+"  "+p.getAddress().getState()));

		

		        
							
		container.close();
		
		
	}
}

/*
// what is Spring framework : is an application development framework in java . 
// it can be used from small desktop application to 
// big enterprrise application . 
// it is like a one stop shop for java devlpers . 
// it is not a new technology but it simplifies the java devlopement work 
// Spring is light weight , modular 
// the spring framework is organized in the form modules
// compare to EJB container , spring container light weight container . 
// beansFactory         sping framework container 
// ApplicationContext 

 //	Wish w = container.getBean("wish1", Wish.class);
		Wish w1  = container.getBean("wish1",Wish.class);
		
		System.out.println(w1.getMessage());
		
	Wish w2 = container.getBean("wish1",Wish.class);
		w2.setMessage("Spring welcomes you ");
		System.out.println(w1.getMessage());
		System.out.println(w2.getMessage());
 */

