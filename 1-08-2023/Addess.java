package com.amang;

import org.springframework.stereotype.Component;

//@Component  // indicates that this is a bean class whose xml configuration is not required . 

public class Address 
{
private String hno="1-2-3";
private String streetName="abcd" ; 
private String city="ahmdabadh" ; 
private String state="gujrath";
public Address() {
	
}
public Address(String hno, String streetName, String city, String state) {
	super();
	this.hno = hno;
	this.streetName = streetName;
	this.city = city;
	this.state = state;
	
}


public String getHno() {
	return hno;
}

@Override
public String toString() {
	return "Address [hno=" + hno + ", streetName=" + streetName + ", city=" + city + ", state=" + state + "]";
}
public void setHno(String hno) {
	this.hno = hno;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
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

	
}
