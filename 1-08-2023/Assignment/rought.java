package com.amang.spring2;

import org.springframework.stereotype.Component;

@Component
public class AdharCard {
	private String name ; 
	private Integer age; 
	private String address ; 
	private Integer phoneNumber;
	public AdharCard() {
		
	}
	public AdharCard(String name, Integer age, String address, Integer phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "AdharCard [name=" +name+" , age=" + age + " , address="+ address + ",phoneNumber="+phoneNumber+"]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	} 
	
	
	

}
.......................................................

package com.amang.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*

 
 */
public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
      Citizen c = container.getBean(Citizen.class);
      System.out.println(c.getCity());
      
     //ystem.out.println(c.getAge();
    }
}


............................................................................................................


<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"

    xmlns:p="http://www.springframework.org/schema/p"

    xmlns:c="http://www.springframework.org/schema/c"
    xmlns:context="http://www.springframework.org/schema/context"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">


<context:component-scan base-package="com.amang.spring2"/>
    

</beans>
...................................................................

  package com.amang.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Citizen {

	private String city ; 
	private String state  ;
	@Autowired
	private AdharCard adharCard ; 
	public Citizen() {}
	public Citizen(String city, String state, AdharCard adharCard) {
		
		this.city = city;
		this.state = state;
		this.adharCard = adharCard;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public AdharCard getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}
	
}


