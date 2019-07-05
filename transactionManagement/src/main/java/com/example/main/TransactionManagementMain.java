package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.service.CustomerManager;
import com.example.service.CustomerManagerImpl;

public class TransactionManagementMain {

	
	public static void main(String[] args) 
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		CustomerManager customerManager=context.getBean("customerManager",CustomerManagerImpl.class);
		Customer cust=creatDummyCustomer();
		customerManager.createCustomer(cust);
	}

	private static Customer creatDummyCustomer() {
		
		Customer customer=new Customer();
		Address address=new Address();
		customer.setId(7);
		customer.setName("musaddik");
		address.setAddress("pune");
		address.setCountry("India");
		address.setId(7);
		customer.setAddress(address);
		return customer;
	}
}
