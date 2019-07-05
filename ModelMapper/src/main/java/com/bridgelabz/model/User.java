package com.bridgelabz.model;

public class User {
	
	private String firstname;
	private String lastname;
	private int id;
	private String city;
	
	public User() {}

	public User(String firstname, String lastname, int id, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.city = city;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + ", city=" + city + "]";
	}
	
	
	
	

}
