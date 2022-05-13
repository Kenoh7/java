package com.kenoh.mvclanguages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kenoh.mvclanguages.models.Language;
import com.kenoh.mvclanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
//	import repository
	private final LanguageRepository languageRepo;

	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}

//	find all
	public List<Language> allLanguages() {
		return languageRepo.findAll();
	}

// find one 
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepo.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

// create
	public Language createLanguage(Language language) {
		return languageRepo.save(language);
	}

// update
	public Language updateLanguage(Language language) {
		return languageRepo.save(language);
	}

// delete
	public void deleteLanguage(Long id) {
		languageRepo.deleteById(id);
	}
}

