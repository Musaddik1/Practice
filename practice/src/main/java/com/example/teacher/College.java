package com.example.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@Component
@ComponentScan(basePackages = "com.example.teacher")
public class College {
	
	@Value("RCPIT")
	private String collegeName;

	@Autowired
	private Address address;
	
	  @Autowired
	  @Qualifier("scienceTeacher")
	  private Teacher teacher;
	
	public College()
	{
		
	}

	public College(String collegeName, Address address, Teacher teacher) {
		this.collegeName = collegeName;
		this.address = address;
		this.teacher = teacher;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void test()
	{
		teacher.teach();
		System.out.println("method this called");
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", address=" + address + ", teacher=" + teacher + "]";
	}
	
	
	

}
