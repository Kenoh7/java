package com.kenoh.bookclub.controllers;

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

import com.kenoh.bookclub.models.Book;
import com.kenoh.bookclub.models.User;
import com.kenoh.bookclub.services.MainService;
import com.kenoh.bookclub.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private UserService userService;

//	GET ALL
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("userId");
		
		User user = userService.findOneUser(userId);
		
		model.addAttribute("user", user);
		model.addAttribute("books", mainService.allBooks());
		return "index.jsp";
	}
	
//	FIND ONE
	@GetMapping("/books/{id}")
	public String showOneBook(@PathVariable("id")Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", mainService.findOneBook(id));
		return "oneBook.jsp";
	}
//	CREATE BOOK
	@GetMapping("/books/new")
	public String newBookForm(@ModelAttribute("book")Book book, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "newBook.jsp";
	}
	
	@PostMapping("/books/new")
	public String processBook(@Valid @ModelAttribute("book")Book book, BindingResult result
			) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		}else {
			mainService.createBook(book);
			return "redirect:/home";
		}
	}
	
//	EDIT BOOK
	@GetMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id")Long id, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", mainService.findOneBook(id));
		return "editBook.jsp";
	}
	
	@PutMapping("/books/{id}/edit")
	public String processEditBook(@Valid @ModelAttribute("book")Book book, BindingResult result) {
		if(result.hasErrors()) {
		return "editBook.jsp";
	}else {
		mainService.updateBook(book);
		return "redirect:/home";
	}
	}
//	DELETE BOOK
	@DeleteMapping("/books/{id}/delete")
	public String deleteBook(@PathVariable("id")Long id) {
		mainService.deleteBook(id);
		return "redirect:/home";
	}
}
