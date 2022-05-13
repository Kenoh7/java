package com.kenoh.dojoandninja.controllers;

import java.util.List;

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
import com.kenoh.dojoandninja.models.Ninja;
import com.kenoh.dojoandninja.services.MainService;

@Controller
public class NinjaController {

	@Autowired
	private MainService mainService;
	
//	Create a new Ninja
	
	@GetMapping("/ninjas/new")
	public String ninjaForm(@ModelAttribute("ninja")Ninja ninja,Model model) {
		List<Dojo> allDojos = mainService.allDojos();
		model.addAttribute("dojos", allDojos);
		return "createNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String processNinjaForm(@Valid @ModelAttribute("ninja")Ninja ninja,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", mainService.allDojos());
			return "createNinja.jsp";
		}else {
			mainService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
}
