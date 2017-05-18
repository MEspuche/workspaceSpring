package com.huios.DemoInjectionSpectacle.intercepteurs;

import org.aspectj.lang.ProceedingJoinPoint;

public class Musiciens {

	public Object jeJoue(ProceedingJoinPoint jPoint) throws Throwable
	{
		System.out.println("je joue");
		return jPoint.proceed();
	}
	

	
}
