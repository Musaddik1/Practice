package com.example.student;

public class Address {

	
	private String city;
	
	public Address()
	{
		
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	 
}
