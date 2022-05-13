package com.kenoh.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 1);
		}else {
			Integer sessionCount = (Integer) session.getAttribute("count");
			sessionCount++;
			session.setAttribute("count", sessionCount);
		}
		return "setSession.jsp";
	}
	@GetMapping("/counter")
	public String getCount() {
		return "getSession.jsp";
	}
}
