package com.amang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import org.springframework.beans.factory.annotation.Qualifier;
@Component

public class Person {
		
	private int ssn=101 ; 
	private String name="WSSWGFsd" ; 
	private int age=21 ; 
	@Autowired
	
	private Address address ;
	public Person() {
	
	}
	
	Person(Address address){
		this.address = address ; 
	}
	public Person(int ssn, String name, int age, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getAddharNo() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	public void initPerson() {
		System.out.println("from initerson");
	}
	public void destPerson() {
		System.out.println("from destPerson");
	}
	
	
}
