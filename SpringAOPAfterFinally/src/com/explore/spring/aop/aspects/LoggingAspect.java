package com.explore.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	//After advice will be executed whether the method returns successfully or not
	@After(value="execution(* com.explore.spring.aop.dao.AccountDAO.findAllAccounts(..))")
	public void afterFinallyFindAllAccountsAdvice(JoinPoint joinPoint) {
		
		String method=joinPoint.getSignature().toShortString();
		System.out.println("Intercepted method by afterFinallyFindAllAccountsAdvice is --> "+method);
		
	}

}
