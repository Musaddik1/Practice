package com.example.demo;

import com.example.teacher.Address;

public class Student {

	private String name;
	private int  rollno;
	private float percentage;
	private Address address;
	
	public Student()
	{
		
	}

	public Student(String name, int rollno, float percentage, Address address) {
		
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", percentage=" + percentage + ", address=" + address
				+ "]";
	}
	
	
}
