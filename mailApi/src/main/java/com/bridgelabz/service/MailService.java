package com.bridgelabz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.User;

@Service
public class MailService {

	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(User user)
	{
		SimpleMailMessage simple=new SimpleMailMessage();
		simple.setTo(user.getEmailAddress());
		simple.setSubject("MailService");
		simple.setText("hi");
		javaMailSender.send(simple);
	}
	
}
