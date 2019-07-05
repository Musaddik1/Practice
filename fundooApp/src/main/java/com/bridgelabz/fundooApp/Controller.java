package com.bridgelabz.fundooApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String getUser()
	{
		return "hello";
	}
}
