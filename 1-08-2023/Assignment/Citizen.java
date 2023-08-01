package com.amang.spring2;

import org.springframework.beans.factory.annotation.Autowired;

public class Citizen {

	private String name ; 
	private Integer age ;
	@Autowired
	private AdharCard adharCard ; 
	public Citizen() {
		
	}
	
	Citizen(AdharCard adharcard){
		this.adharCard = adharcard ; 
	}
	
	public Citizen(String name, Integer age ,String  address , Integer PhoneNumber ) {
		super();
		this.name = name;
		this.age = age;

		
	}
	
	public String getName() {
		return name;
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
	
}
