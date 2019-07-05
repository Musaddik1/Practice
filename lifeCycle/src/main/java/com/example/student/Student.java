package com.example.student;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class Student implements BeanNameAware,BeanFactoryAware,DisposableBean {
	

	private Address address;
	private int age;
	private ArrayList<String> mobile;
	
	public Student()
	
	{
		System.out.println("I am in constructor ");
	}

	public Student(Address address, int age, ArrayList<String> mobile) {
		super();
		this.address = address;
		this.age = age;
		this.mobile = mobile;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMobile(ArrayList<String> mobile) {
		this.mobile = mobile;
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy method called from disposalbean ");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("set bean factory method called ");
		
	}

	@Override
	public void setBeanName(String name) {
		
		System.out.println("set bean name  called  name "+name);
		
	}
	
	public void init_method()
	{
		System.out.println("init_method mentioned in xml called");
	}
	public void destroy_method()
	{
		System.out.println("destroy_method metioned in xml called..");
	}
	
	@PostConstruct
	public void initIt()
	{
		
		System.out.println("InitIt method after properties are set :");
	}
	
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("Spring Clean Up! Student is cleaned up now.");
	}
	
	

	
}
