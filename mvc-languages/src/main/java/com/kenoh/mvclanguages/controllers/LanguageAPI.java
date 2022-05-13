package com.kenoh.mvclanguages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kenoh.mvclanguages.models.Language;
import com.kenoh.mvclanguages.services.LanguageService;

@RestController
public class LanguageAPI {
	private final LanguageService languageService;
	public LanguageAPI(LanguageService languageService) {
		this.languageService = languageService;
	}
	
// 		Find All
		@GetMapping("/api/languages")
		public List<Language> findAllLanguage(){
			return languageService.allLanguages();
		}
		
// 		Create
		@PostMapping("/api/languages")
		public Language createLanguage(
				@RequestParam("name")String name,
				@RequestParam("creator")String creator,
				@RequestParam("currentVersion")Double currentVersion
				) {
			Language newLanguage = new Language(name, creator, currentVersion);
			return languageService.createLanguage(newLanguage);
		}
		
//		Find One
		@GetMapping("/api/languages/{id}")
		public Language oneLanguage(@PathVariable("id") Long id) {
			return languageService.findLanguage(id);
		}
		
//		Update
		@PutMapping(value="/api/languages/{id}")
		public Language updateLanguage(
				@PathVariable("id") Long id,
				@RequestParam("name")String name,
				@RequestParam("creator")String creator,
				@RequestParam("currentVersion")Double currentVersion
				) {
			Language updateLanguage = languageService.findLanguage(id);
			updateLanguage.setName(name);
			updateLanguage.setCreator(creator);
			updateLanguage.setCurrentVersion(currentVersion);
			
			return languageService.updateLanguage(updateLanguage);
		}
//		Delete
		@DeleteMapping("/api/languages/{id}")
		public void deleteLanguage(@PathVariable("id")Long id) {
			languageService.deleteLanguage(id);
		}
}
