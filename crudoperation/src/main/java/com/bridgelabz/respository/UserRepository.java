package com.bridgelabz.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.model.User;

public interface UserRepository extends MongoRepository<User, String> 
{
	public User findByFirstname(String firstname);
	public User findByLastname(String lastname);
}
