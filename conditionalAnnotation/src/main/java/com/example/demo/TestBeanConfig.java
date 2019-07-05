package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class TestBeanConfig {

	@Bean
	@Conditional(TestBeanCondition.class)
	public TestBean testBean()
	{
		System.out.println("Test bean created...");
		return new TestBean();
	}
}
