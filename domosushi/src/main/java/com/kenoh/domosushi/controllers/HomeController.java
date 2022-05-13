package com.kenoh.domosushi.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenoh.domosushi.models.Admin;
import com.kenoh.domosushi.models.DomoSchedule;
import com.kenoh.domosushi.services.AdminService;
import com.kenoh.domosushi.services.MainService;

@Controller
public class HomeController {

	@Autowired
	private MainService mainService;
	
	@Autowired
	private AdminService adminService;
	
//	GET ALL SCHEDULE
	@GetMapping("/home")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu.jsp";
	}
	
	@GetMapping("/location")
	public String location(Model model, HttpSession session) {
//		if(session.getAttribute("adminId") == null) {
//			return "redirect:/";
//		}
		Long adminId = (Long)session.getAttribute("adminId");
		
		Admin admin = adminService.findOneAdmin(adminId);
		
		model.addAttribute("admin", admin);
		model.addAttribute("domoschedule", mainService.allSchedule());
		return "location.jsp";
	}
	
//	FIND ONE SCHEDULE
	@GetMapping("/schedule/{id}")
	public String showOneSchedule(@PathVariable("id")Long id, Model model, HttpSession session) {
//		if(session.getAttribute("adminId") == null) {
//			return "redirect:/";
//		}
		model.addAttribute("domoschedule", mainService.findOneSchedule(id));
		return "oneSchedule.jsp";
	}

//	CREATE BABY NAME
	@GetMapping("/schedule/new")
	public String newScheduleForm(@ModelAttribute("domoschedule")DomoSchedule domoschedule, HttpSession session) {
//		if(session.getAttribute("adminId") == null) {
//			return "redirect:/";
//		}
		return "newSchedule.jsp";
	}
	@PostMapping("/schedule/new")
	public String processName(@Valid @ModelAttribute("domoschedule")DomoSchedule domoschedule, BindingResult result
			) {
		if(result.hasErrors()) {
			return "newSchedule.jsp";
		}else {
			mainService.createSchedule(domoschedule);
			return "redirect:/home";
		}
	}
}
