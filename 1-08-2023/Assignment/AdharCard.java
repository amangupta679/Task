package com.amang.spring2;

public class AdharCard {
	private String name="Aman Gupta" ; 
	private Integer age=23 ; 
	private String address="west bengal" ; 
	private Integer phoneNumber=234346;
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
