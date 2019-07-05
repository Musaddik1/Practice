package com.bridgelabz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.User;
import com.bridgelabz.service.MailService;

@RestController
public class MailController {

	@Autowired
	private MailService mailService;
	@Autowired
	private User user;
	
	@RequestMapping("send")
	public String send()
	{
		user.setEmailAddress("musaddikshaikh10@gmail.com");
		mailService.sendMail(user);
		return "congrates";
	}
}
