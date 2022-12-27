package com.test.code;

public class Address implements Cloneable{

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	}


	Integer pincode;
	String city;
	String state;
	
	public Address(Integer pincode, String city, String state) {
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	
	public Integer getPincode() {
		return pincode;
	}
	
	
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
