package com.kenoh.domosushi.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenoh.domosushi.models.Admin;
import com.kenoh.domosushi.models.LoginAdmin;
import com.kenoh.domosushi.services.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	// REGISTER PAGE
		@GetMapping("/admin")
		public String index(Model model) {
			model.addAttribute("newAdmin", new Admin());         // REGISTER
			model.addAttribute("newLogin", new LoginAdmin());   // LOGIN
			return "logreg.jsp";
		}
		
		@PostMapping("/register")
		public String register(@Valid @ModelAttribute("newAdmin")Admin newAdmin,
				BindingResult result, Model model, HttpSession session) {
			
			adminService.register(newAdmin, result);
			
			if(result.hasErrors()) {
//			CHECK VALIDATIONS
				model.addAttribute("newLogin",new LoginAdmin()); // RENDERING REGISTER ModelAttribute
				return "logreg.jsp";
			}
			
//			IF NO ERROR, STORE THE ID IN SESSION
			session.setAttribute("adminId", newAdmin.getId());
			
			return "redirect:/admin";
		}
		// LOGIN PAGE
		@PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginAdmin newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
	         Admin admin = adminService.login(newLogin, result);
	    
	        if(result.hasErrors()) {
	            model.addAttribute("newAdmin", new Admin()); // RENDERING REGISTER ModelAttribute
	            return "logreg.jsp";
	        }
	        
//			IF THERE ARE NO ERRORS, STORE THE ID IN SESSION
	        session.setAttribute("adminId", admin.getId());
	        return "redirect:/home";
	    }   
		
//		LOGOUT
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/";
		}
}
