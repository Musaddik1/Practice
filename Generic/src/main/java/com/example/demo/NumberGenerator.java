package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NumberGenerator implements Generator<Integer> {

	Integer number=1;
	@Override
	public Integer generate() 
	{
		
		return number++;
	}
	

}
