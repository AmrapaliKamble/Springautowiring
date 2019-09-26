package com.bv.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	private int id;
	private String name;
	private int age;
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}
	
	/*@Required*/
	public void setId(int id) {
		this.id = id;
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
	
	/*@Required*/
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
/*
	@Autowired
	public Person(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	*/
	
	
}
