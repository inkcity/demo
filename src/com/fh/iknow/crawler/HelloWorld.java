package com.fh.iknow.crawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.glassfish.gmbal.ParameterNames;


@RestController
public class HelloWorld {
	private JdbcTest jdbctest;
	
	@Autowired
	public HelloWorld(JdbcTest jdbcTest) {
		this.jdbctest = jdbcTest;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "{\"msg\":\"hello wrold\"}";
	}
	
	@RequestMapping("/count")
	public String count() {
		int count = jdbctest.count();
		return String.valueOf(count);
	}
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		HelloWorld bean = ctx.getBean(HelloWorld.class);
		bean.hello();
		ctx.close();
	}
}
