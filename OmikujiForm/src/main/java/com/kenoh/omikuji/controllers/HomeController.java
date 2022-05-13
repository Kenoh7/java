package com.kenoh.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//	Show Basic Form
	@GetMapping("/omikuji")
	public String showForm() {
		return "createForm.jsp";
	}
	
//	Process Form
	@PostMapping("/processForm")
	public String processForm(
			@RequestParam("pickNumber") Integer pickNumber,
			@RequestParam("cityName") String cityName,
			@RequestParam("namePerson") String namePerson,
			@RequestParam("hobby") String hobby,
			@RequestParam("pet") String pet,
			@RequestParam("sayNice") String sayNice,
			HttpSession session
			) {
		session.setAttribute("pickNumber", pickNumber);
		session.setAttribute("cityName", cityName);
		session.setAttribute("namePerson", namePerson);
		session.setAttribute("hobby", hobby);
		session.setAttribute("pet", pet);
		session.setAttribute("sayNice", sayNice);
		return "redirect:/omikuji/show";
	}
	
//	Show Form Results
	@GetMapping("/omikuji/show")
	public String reviewResult() {
		return "showForm.jsp";
	}
}