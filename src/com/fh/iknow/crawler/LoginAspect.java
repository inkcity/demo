package com.fh.iknow.crawler;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoginAspect {
	
	@Pointcut("execution(* com.fh.iknow.crawler.HelloWorld.*(..))")
	private void isLogin(){}
	
	@Before("isLogin()")
	private void before() {
		System.out.println("before");
	}
	
	@AfterReturning("isLogin()")
	private void after() {
		System.out.println("after");
	}
	
}
