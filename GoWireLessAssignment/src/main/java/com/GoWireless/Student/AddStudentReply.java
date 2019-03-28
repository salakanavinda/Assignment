package com.GoWireless.Student;

//when addd student after will provide the reply for the user
public class AddStudentReply {
	
	private int stuId;
	private String name;
	private String address;
	private String status;
	
	
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
	public String getStatus() {
		return status;
	}
	
	//Status of the Student
	public void setStatus(String status) {
		this.status = status;
	}

}
