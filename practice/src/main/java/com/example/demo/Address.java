package com.example.demo;

public class Address {
	
	private String city;
	
	public Address()
	{
		
	}

	public Address(String city) {
	
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
