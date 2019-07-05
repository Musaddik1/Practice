package com.example.teacher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTeacher {
	
	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 * College college=context.getBean("college", College.class); college.test();
		 * System.out.println(college);
		 */
		
		ApplicationContext context=new AnnotationConfigApplicationContext(College.class);
		College college=context.getBean("college",College.class);
		college.test();
		
		System.out.println(college);
	}

}
