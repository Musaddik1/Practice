package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages ="com.example.demo")
@Component("result")
public class Result {

	@Autowired
	private List<Company> companyname;
	

	@Override
	public String toString() {
		return companyname.toString();
	}
}
