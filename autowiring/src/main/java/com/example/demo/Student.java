package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	
	 @Autowired
	 
	 @Qualifier("address1")
	 
	private Address address;
	
	private String name;
	
	public Student()
	{
		
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getInfo()
	{
		System.out.println("address got ");
		System.out.println("Name  "+name);
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + "]";
	}
	
}
