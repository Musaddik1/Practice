package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AlphabetsGenerator implements Generator<String>{

	private char ch=65;
	
	@Override
	public String generate() {
		
		
		return "" +(ch++);
	}

}
