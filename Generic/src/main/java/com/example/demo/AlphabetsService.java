package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AlphabetsService {
	
	@Autowired
	private AlphabetsGenerator  generator;
	
	public AlphabetsService() {}

	public AlphabetsService(AlphabetsGenerator generator) {
		
		this.generator = generator;
		System.out.println("setter method called..");
	}

	public String getAlphabets()
	{
		return generator.generate();
	}
	
	

}
