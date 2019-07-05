package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.AroundMethod;

public class Client {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		AroundMethod am=new AroundMethod();
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(am);
		
		Bank bproxy=(Bank) pfb.getObject();
		int amount=bproxy.deposite("sbi123", 5000);
		//System.out.println(amount);
	}

}
