package com.kenoh.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenoh.dojoandninja.models.Dojo;
import com.kenoh.dojoandninja.services.MainService;

@Controller
public class DojoController {
	
	@Autowired
	private MainService mainService;
	
//	Create a new Dojo
	
	@GetMapping("/dojos/new")
	public String dojoForm(@ModelAttribute("dojo")Dojo dojo) {
		return "createDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String processDojoForm(@Valid @ModelAttribute("dojo")Dojo dojo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "createDojo.jsp";
		}else {
			mainService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
//	One Dojo
	@GetMapping("/dojos/{id}")
	public String showOneDojo(@PathVariable("id")Long id, Model model) {
		model.addAttribute("dojo", mainService.findOneDojo(id));
		return "oneDojo.jsp";
	}
	
}
