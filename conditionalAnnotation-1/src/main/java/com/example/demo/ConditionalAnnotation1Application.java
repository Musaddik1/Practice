package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConditionalAnnotation1Application {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(DayConfig.class);
		EveryDayBean date=context.getBean("getEveryDayBean",EveryDayBean.class);
	}

}
