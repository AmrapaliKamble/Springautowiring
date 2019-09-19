package com.bv.model;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	private MyDate doj;
	
	public MyDate getDoj() {
		return doj;
	}
	public void setDoj(MyDate doj) {
		this.doj = doj;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
