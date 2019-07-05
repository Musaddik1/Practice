package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		 System.out.println("configuration completed....");
		 Sim sim=context.getBean("airtel",Airtel.class);
		 sim.calling();
		 sim.data();
		 sim=context.getBean("vodafone",Vodafone.class);
		 sim.calling();
		 sim.data();
	}

}
