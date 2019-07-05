package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(TestBeanConfig.class);
		TestBean bean=context.getBean("testBean",TestBean.class);
		bean.setName("musaddik");
		System.out.println("get Name :"+bean.getName());
		((ConfigurableApplicationContext)context).close();
	}
}
