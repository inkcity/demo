package com.fh.iknow.crawler;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class Login {

//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(@RequestParam("username") String username
//			, @RequestParam("password") String password
//			, HttpSession session) {
//		System.out.println("enter login");
//		System.out.println(username);
//		System.out.println(password);
//		if ("920907676@qq.com".equals(username) && "aaa".equals(password)) {
//			session.setAttribute("username", username);
//			return "login";
//		} else {
//			return "loginFail";
//		}
//	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam("username") String username
			, @RequestParam("password") String password
			, HttpSession session) {
		System.out.println("enter login");
		System.out.println(username);
		System.out.println(password);
		JSONObject result = new JSONObject();
		if ("920907676@qq.com".equals(username) && "aaa".equals(password)) {
			session.setAttribute("username", username);
			result.put("msg", "true");
			System.out.println(result.toJSONString());
			return result.toJSONString();
		} else {
			result.put("msg", "false");
			return result.toJSONString();
		}
	}
}
