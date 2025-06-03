package com.example.Spring.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component // component will register this class as a spring bean

public class executionTimeAspect {
//	Around is an Advice
	@Around("execution(*com.example.Spring.AOP.service.*.*(..))") // pointcut expression.
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable  {
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();

//		Print the log to the console
		System.out.println(joinPoint.getSignature() + "executed in :" + (endTime - startTime) + "ms");
		return result;
	}
}
