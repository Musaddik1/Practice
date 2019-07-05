package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberService {

	@Autowired
	private NumberGenerator generator;
	
	public NumberService() {}
	
	public Integer getNumber()
	{
		return generator.generate();
	}
}
