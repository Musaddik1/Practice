package com.example.model;

public class Address {
	
	private int id;
	private String address;
	private String country;
	
	public Address()
	{
		
	}

	public Address(int id, String address, String country) {
	
		this.id = id;
		this.address = address;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", country=" + country + "]";
	}
	
	
}
