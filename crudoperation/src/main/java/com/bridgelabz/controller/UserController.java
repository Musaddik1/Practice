package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.User;
import com.bridgelabz.service.UserServiceImpl;
@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/create")
	public User create(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age)
	{
		return userServiceImpl.create(firstname, lastname, age);
		
	}
	@GetMapping("/getAll")
	public List<User> getAllUser()
	{
		return userServiceImpl.getAllUser();
	}
	@GetMapping("/getUser")
	public User getUser(@RequestParam String firstname)
	{
		return userServiceImpl.getUser(firstname);
		
	}
	public void deleletAllUser()
	{
		userServiceImpl.deleteAllUser();
	}
	
	public void deleteUser(String firstname)
	{
		userServiceImpl.deleteUser(firstname);
	}
	@PutMapping("/update")
	public User update(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age)
	{
		return userServiceImpl.update(firstname, lastname, age);
	}
	
}
