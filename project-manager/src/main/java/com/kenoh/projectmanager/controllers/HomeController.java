package com.kenoh.projectmanager.controllers;

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

import com.kenoh.projectmanager.models.Project;
import com.kenoh.projectmanager.models.User;
import com.kenoh.projectmanager.services.MainService;
import com.kenoh.projectmanager.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private MainService mainService;
	
	@Autowired
	private UserService userService;
	
//	GET ALL
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("userId");
		
		User user = userService.findOneUser(userId);
		model.addAttribute("user", user);
		model.addAttribute("projects", mainService.allProjects());
		return "index.jsp";
	}
//	FIND ONE
	@GetMapping("/projects/{id}")
	public String showOneProject(@PathVariable("id")Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("project", mainService.findOneProject(id));
		return "oneProject.jsp";
	}
//	CREATE PROJECT
	@GetMapping("/projects/new")
	public String newProjectForm(@ModelAttribute("project")Project project, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "newProject.jsp";
	}
	
	@PostMapping("/projects/new")
	public String processProject(@Valid @ModelAttribute("project")Project project, BindingResult result
			) {
		if(result.hasErrors()) {
			return "newProject.jsp";
		}else {
			mainService.createProject(project);
			return "redirect:/dashboard";
		}
	}
//	EDIT PROJECT
	@GetMapping("/projects/{id}/edit")
	public String editProject(@PathVariable("id")Long id, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("project", mainService.findOneProject(id));
		return "editProject.jsp";
	}
	
	@PutMapping("/projects/{id}/edit")
	public String processEditProject(@Valid @ModelAttribute("project")Project project, BindingResult result) {
		if(result.hasErrors()) {
		return "editProject.jsp";
	}else {
		mainService.updateProject(project);
		return "redirect:/dashboard";
	}
	}
	
//	DELETE PROJECT
	@DeleteMapping("/projects/{id}/delete")
	public String deleteProject(@PathVariable("id")Long id) {
		mainService.deleteProject(id);
		return "redirect:/dashboard";
	}
}
