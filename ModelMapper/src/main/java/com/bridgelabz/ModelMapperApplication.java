package com.bridgelabz;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bridgelabz.dto.UserDto;
import com.bridgelabz.model.User;

@SpringBootApplication
public class ModelMapperApplication {

	public static void main(String[] args) {
		
		
		User user=new User("musaddik", "shaikh", 1, "pune");
		ModelMapper mapper=new ModelMapper();
		UserDto userdto=mapper.map(user, UserDto.class);
		System.out.println(userdto);
		
		/* SpringApplication.run(ModelMapperApplication.class, args); */
	}

}
