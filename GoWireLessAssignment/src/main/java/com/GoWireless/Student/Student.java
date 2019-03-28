package com.GoWireless.Student;

//Student Class
public class Student {
	
	//Instance variables of Student
	private int stuId;
	private String name;
	private String address;
	
	//Getters and Setters of Instance variables
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//toString method 
	public String toString() {
		return this.stuId+"|"+this.name+"|"+this.address;
	}

}
