package com.bv.model;

import java.util.List;

public class Student {
	
	private int studentId;
	private String studentName;
	private List address;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//private Address address;
	
	
	
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public int getStudentId() {
		return studentId;
	}
	public List getAddress() {
		return address;
	}
	public void setAddress(List address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	/*public Student(int studentId, String studentName,Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}*/
	public Student(int studentId, String studentName, List address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	
	public void printAddress() {
		for(Object add:address) {
			System.out.println(add);
		}
		//System.out.println(address);
	}
	
}
