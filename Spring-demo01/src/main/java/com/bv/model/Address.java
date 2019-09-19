package com.bv.model;

public class Address {
	private String city;
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	private String state;
	private int zipcode;
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipcode() {
		return zipcode;
	}
/*	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}*/
	@Override
	public String toString() {
		return "\nAddress :"+"\n"+"city=" + city + "\n"+ "state=" + state + "\n"+"zipcode=" + zipcode ;
	}
	public Address() {
	
	}
	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	

}
