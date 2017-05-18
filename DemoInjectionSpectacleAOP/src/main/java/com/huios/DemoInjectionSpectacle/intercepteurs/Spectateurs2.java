package com.huios.DemoInjectionSpectacle.intercepteurs;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Spectateurs2 {

	@Pointcut("execution(* *.jouer(..))")
	public void spectacle(){
		
	}
	@Before("spectacle()")
	public void prendPlace()
	{
		System.out.println("les spectateurs prennent place encore");
	}
	@After("spectacle()")
	public void applaudit()
	{
		System.out.println("les spectateurs applaudissent encore : BRAVO !");
	}
}
