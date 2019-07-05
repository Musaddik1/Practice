package com.example.Student;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("musaddik")
	private String name;
	@Value("1")
	private int id;
	@Value("70")
	private float percentage;
	
	public Student() {}

	public Student(String name, int id, float percentage) {
		
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public float getPercentage() {
		return percentage;
	}
	

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
	}
	
	

}
