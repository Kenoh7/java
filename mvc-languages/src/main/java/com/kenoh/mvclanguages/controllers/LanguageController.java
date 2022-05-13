package com.kenoh.mvclanguages.controllers;

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

import com.kenoh.mvclanguages.models.Language;
import com.kenoh.mvclanguages.services.LanguageService;

@Controller
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
//	Find One
	@GetMapping("/languages/{id}")
	public String oneLanguage(@PathVariable("id")Long id, Model model) {
		Language oneLanguage = languageService.findLanguage(id);
		model.addAttribute("language",oneLanguage);
		return"showLanguage.jsp";
	}
//	All Languages
	@GetMapping("/languages")
	public String allLanguages(Model model) {
		model.addAttribute("languages",languageService.allLanguages());
		model.addAttribute("language", new Language());
		return "index.jsp";
	}
//	Create // Post // process the form
	@PostMapping("/languages/create")
	public String processLanguage(@Valid @ModelAttribute("language")Language language,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("languages", languageService.allLanguages());
			return "index.jsp";
		}else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
//	Edit // 1. render the form 2. process the form
//	render the form --> findOne + create
	
	@GetMapping("/languages/{id}/edit")
	public String renderLanguageForm(@PathVariable("id")Long id, Model model) {
		Language oneLanguage = languageService.findLanguage(id);
		model.addAttribute("language", oneLanguage);
		return "editLanguage.jsp";
	}
	
	@PutMapping("/languages/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("language")Language language,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editLanguage.jsp";
		}else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
//	Delete //
	@DeleteMapping("/languages/{id}")
	public String deleteLanguage(@PathVariable("id")Long id) {
		languageService.deleteLanguage(id);
	return "redirect:/languages";
	}
}
