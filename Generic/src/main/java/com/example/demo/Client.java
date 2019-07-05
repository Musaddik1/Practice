package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		AlphabetsService service=context.getBean("alphabetsService",AlphabetsService.class);
	    System.out.println(service.getAlphabets());
	    System.out.println(service.getAlphabets());
		NumberService numberService=context.getBean("numberService",NumberService.class);
		System.out.println(numberService.getNumber());
		System.out.println(numberService.getNumber());
	}

}
