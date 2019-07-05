package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class Nokia implements Company{

	private String name="Nokia at 1";
	
	@Override
	public String toString() {
	return this.name;
	}
}
