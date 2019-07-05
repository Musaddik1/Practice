package com.example.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(College.class);
		College college=context.getBean("collegeBean",College.class);
		college.test();
		System.out.println(college);
		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		 * College college=context.getBean("collegeBean",College.class);
		 * System.out.println(college);
		 */
	}
}
