package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		/*
		 * ConfigurableApplicationContext context= SpringApplication.run(Client.class,
		 * args); Result result=context.getBean("result",Result.class);
		 * System.out.println(result);
		 */
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Result.class);
		Result result=context.getBean("result",Result.class);
		System.out.println(result);
	}

}
