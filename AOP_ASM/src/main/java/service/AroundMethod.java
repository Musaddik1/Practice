package service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import business.Bank;

public class AroundMethod  implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
	
		Log log=LogFactory.getLog(Bank.class);
		log.info("before deposite method....");
		Object obj=invocation.proceed();
		log.info("after deposite method...");
		
		return obj;
	}

}
