package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class Samsung implements Company{

	private String name="Samsung at 3";
	
	@Override
	public String toString() {
	
		return this.name;
	}
}
