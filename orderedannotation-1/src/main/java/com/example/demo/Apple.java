package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Apple  implements Company{

	private String name="Apple at 2";
	@Override
	public String toString() {
		return name;
	}
}
