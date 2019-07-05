package com.example.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.example.Annotation")
@Component("collegeBean")
public class College {

	@Value("RCPIT")
	private String name;
	@Autowired
//	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	public College() {}
	
	public void test()
	{
		System.out.println("test this method");
		System.out.println("College Name : "+name);
		teacher.teach();
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
