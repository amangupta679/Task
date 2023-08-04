package org.springframework.hibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Address {
	@Id
	@Column(name="address_id")
	private int addressId ; 
	@Column(name="name")
	private String houseNo;
	@Column(name="street")
	private String streetName;
	@Column(name="city")
	private String cityName;
	@Column(name="state")
	private String stateName;
	@OneToOne(mappedBy="address")
	public Address() {
		super();
	}
	public Address(int addressId, String houseNo, String streetName, String cityName, String stateName) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
	
	

}
