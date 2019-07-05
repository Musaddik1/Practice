package com.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.User;
import com.bridgelabz.respository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User create(String firstname, String lastname, int age) {
		
		return userRepository.save(new User(firstname, lastname, age));
		
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String firstname) {
	
		return userRepository.findByFirstname(firstname);
	}

	@Override
	public void deleteAllUser() {
		userRepository.deleteAll();
		
	}

	@Override
	public void deleteUser(String firstname) {
		User user=userRepository.findByFirstname(firstname);
		userRepository.delete(user);
		
	}

	@Override
	public User update(String firstname, String lastname, int age) {
		User user=userRepository.findByFirstname(firstname);
		//user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAge(age);
		return userRepository.save(user);
	}

}
