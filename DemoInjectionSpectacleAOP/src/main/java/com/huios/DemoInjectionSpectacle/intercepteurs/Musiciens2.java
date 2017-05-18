package com.huios.DemoInjectionSpectacle.intercepteurs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class Musiciens2 {

	
	@Aspect
	public class Musiciens {

		@Pointcut("execution(* *.performe(..))")
		public void performance(){
		}
		
		@Around("performance()")
		public Object jeJoue(ProceedingJoinPoint jPoint) throws Throwable
		{
			System.out.println("je joue encore");
			return jPoint.proceed();
		}
		
	}

}
