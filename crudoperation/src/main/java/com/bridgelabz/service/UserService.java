package com.bridgelabz.service;

import java.util.List;



import com.bridgelabz.model.User;

public interface UserService {

	public User create(String firstname,String lastname,int age);
	public List<User> getAllUser();
	public User getUser(String firstname);
	public void deleteAllUser();
	public void deleteUser(String firstname);
	
	public User update(String firstname,String lastname,int age);
	

	
}
