package com.kenoh.exam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kenoh.exam.models.Baby;
import com.kenoh.exam.models.User;
import com.kenoh.exam.services.MainService;
import com.kenoh.exam.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private MainService mainService;
	
	@Autowired
	private UserService userService;
	
//	GET ALL BABY NAME
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("userId");
		
		User user = userService.findOneUser(userId);
		
		model.addAttribute("user", user);
		model.addAttribute("babys", mainService.allBabys());
		return "index.jsp";
	}
	
//	FIND ONE BABY NAME
	@GetMapping("/names/{id}")
	public String showOneName(@PathVariable("id")Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("userId");
		User user = userService.findOneUser(userId);
		
		model.addAttribute("user", user);
		model.addAttribute("baby", mainService.findOneBaby(id));
		return "oneName.jsp";
	}
	
//	CREATE BABY NAME
	@GetMapping("/names/new")
	public String newNameForm(@ModelAttribute("baby")Baby baby, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "newName.jsp";
	}
	
	@PostMapping("/names/new")
	public String processName(@Valid @ModelAttribute("baby")Baby baby, BindingResult result
			) {
		if(result.hasErrors()) {
			return "newName.jsp";
		}else {
			mainService.createBaby(baby);
			return "redirect:/home";
		}
	}
	
//	EDIT BABY NAME
	@GetMapping("/names/{id}/edit")
	public String editName(@PathVariable("id")Long id, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("baby", mainService.findOneBaby(id));
		return "editName.jsp";
	}
	
	@PutMapping("/names/{id}/edit")
	public String processEditName(@Valid @ModelAttribute("baby")Baby baby, BindingResult result) {
		if(result.hasErrors()) {
		return "editName.jsp";
	}else {
		mainService.updateBaby(baby);
		return "redirect:/home";
	}
	}
	
//	DELETE BABY NAME
	@DeleteMapping("/names/{id}/delete")
	public String deleteName(@PathVariable("id")Long id) {
		mainService.deleteBaby(id);
		return "redirect:/home";
	}

//  UP VOTE BABY NAME
	@PutMapping("/names/{id}/vote")
	public String voteBaby(@PathVariable("id")Long babyId, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		mainService.voteBaby(babyId, userId);
		
		return "redirect:/home";
	}

//  UN-VOTE BABY NAME
	@PutMapping("/names/{id}/unvote")
	public String unvotedBaby(@PathVariable("id")Long babyId, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		mainService.unvotedBaby(babyId, userId);
		
		return "redirect:/home";
	}
	
}
