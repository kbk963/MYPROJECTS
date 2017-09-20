package com.tek.aop.SpringAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	@Before("execution(public String getName())")
	public void logmethod()
	{
		System.out.println("In Log Method");
	}

}
