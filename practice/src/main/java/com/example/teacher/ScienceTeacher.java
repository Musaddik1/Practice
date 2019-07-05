package com.example.teacher;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("Science teacher is teaching science...");
		
	}

}
