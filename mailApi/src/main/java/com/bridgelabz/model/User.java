package com.bridgelabz.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String emailAddress;
	
	
	public User()
	{
		
		
	}


	public User(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
