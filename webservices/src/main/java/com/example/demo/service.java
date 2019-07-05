package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.tomcat.jni.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@XmlRootElement
public class service {



@RequestMapping(value = "employee")
	public Employee getInfo()
	{
		
		Employee employee=new Employee();
		employee.setEid(1);
		employee.setName("musaddik");
		employee.setSalary(20000);
		return employee;
	}
}
