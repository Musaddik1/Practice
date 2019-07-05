package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.naming.factory.BeanFactory;
import org.springframework.aop.AfterReturningAdvice;

import business.Bank;

public class ReturnAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		Log log= LogFactory.getLog(Bank.class);
		log.info("deposte method  "+returnValue);
		
	}

}
