package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private Department department;
	private String name;
	private int id;
	private double salary;
	private HashMap<Integer, String> mobile;
	
	public Employee() {}

	
	
	public Employee(Department department, String name, int id, double salary, HashMap<Integer, String> mobile) {
		
		this.department = department;
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.mobile = mobile;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 public void setMobile(HashMap<Integer, String> mobile) {
		this.mobile = mobile;
	}



	public void MobileInfo() {
		
		 Set<Entry<Integer, String>> set=mobile.entrySet();
		 Iterator<Entry<Integer, String>> itr=set.iterator();
		 while(itr.hasNext())
		 {
			 Entry<Integer, String> entry=itr.next();
			 System.out.println(entry.getValue());
		 }
		
	}
	@Override
	public String toString() {
		department.getDepartment();
		MobileInfo();
		return "Employee [department=" + department + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}
