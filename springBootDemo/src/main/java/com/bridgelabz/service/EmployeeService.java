package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.bridgelabz.model.Employee;
@Service
public class EmployeeService {

	private List<Employee> employeelist=new ArrayList<Employee>(Arrays.asList(new Employee(1,"musaddik"),
			new Employee(2,"shaikh"),
			new Employee(3, "ahmed")
			
			));
	
	public List<Employee> getAllEmployees()
	{
		
		return  employeelist;
				
				
	}

	public Employee getEmployees(int id)
	{
		return employeelist.stream().filter(t->t.getEid()==id).findFirst().get();
	}
	public void addEmployee(Employee employee)
	{
		employeelist.add(employee);
		
	}
	
	public void updateEmployee(int eid,Employee employee)
	{
		for(int i=0;i<employeelist.size();i++)
		{
			Employee emp=employeelist.get(i);
			
			if(eid==emp.getEid())
			{
				employeelist.set(eid, employee);
				
			}
			
		}
	}
}
