package com.kenoh.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenoh.authentication.models.LoginUser;
import com.kenoh.authentication.models.User;
import com.kenoh.authentication.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("home")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "index.jsp";
	}

// REGISTER PAGE
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());         // REGISTER
		model.addAttribute("newLogin", new LoginUser());   // LOGIN
		return "logReg.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser")User newUser,
			BindingResult result, Model model, HttpSession session) {
		
		userService.register(newUser, result);
		
		if(result.hasErrors()) {
//		CHECK VALIDATIONS
			model.addAttribute("newLogin",new LoginUser()); // RENDERING REGISTER ModelAttribute
			return "logReg.jsp";
		}
		
//		IF NO ERROR, STORE THE ID IN SESSION
		session.setAttribute("userId", newUser.getId());
		
		return "redirect:/home";
	}
//	-----------------------------------------------------------------------------------
	
// LOGIN PAGE
	@PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
         User user = userService.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User()); // RENDERING REGISTER ModelAttribute
            return "logReg.jsp";
        }
        
//		IF THERE ARE NO ERRORS, STORE THE ID IN SESSION
        session.setAttribute("userId", user.getId());
		session.setAttribute("userName", user.getUserName());
        return "redirect:/home";
    }   
	
//	LOGOUT
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
