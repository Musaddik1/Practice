package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class DayConfig {

	@Bean
	@Conditional(TodayDate.class)
	public EveryDayBean getEveryDayBean()
	{
		System.out.println("Object created");
		return new EveryDayBean();
	}
}
