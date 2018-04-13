package com.fh.iknow.crawler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("enter login");
		System.out.println(username);
		System.out.println(password);
		if ("920907676@qq.com".equals(username) && "aaa".equals(password)) {
			return "login";
		} else {
			return "loginFail";
		}
	}
}
