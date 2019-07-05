package test;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;

import service.*;
import business.Bank;

public class Client {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		ReturnAfterAdvice raa=new ReturnAfterAdvice();
		
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(raa);
		Bank bproxy=(Bank) pfb.getObject();
		int amount=bproxy.deposite("sbi123", 5000);
		System.out.println(amount);
	}

}
