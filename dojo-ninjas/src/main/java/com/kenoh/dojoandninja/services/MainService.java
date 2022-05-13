package com.kenoh.dojoandninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenoh.dojoandninja.models.Dojo;
import com.kenoh.dojoandninja.models.Ninja;
import com.kenoh.dojoandninja.repositories.DojoRepository;
import com.kenoh.dojoandninja.repositories.NinjaRepository;

@Service
public class MainService {

	@Autowired
	private DojoRepository dojoRepo;
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo findOneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
}
