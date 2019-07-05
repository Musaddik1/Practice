package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("Pune")
	private String city;
	
	public Address()
	{}
	
	public void address()
	{
		System.out.println("address");
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String city) {
	
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
}
