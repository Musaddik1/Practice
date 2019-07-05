package com.bridgelabz.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Employee;
import com.bridgelabz.service.EmployeeService;
@RestController

public class UserController {

//@PostMapping("/")
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployee( @PathVariable int id)
	{
		return employeeService.getEmployees(id);
		
	}
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable int id)
	{
		employeeService.updateEmployee(id, employee);
	}
}
