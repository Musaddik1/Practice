package com.example.teacher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("pune")
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
