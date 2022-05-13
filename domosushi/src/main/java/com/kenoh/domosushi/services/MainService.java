package com.kenoh.domosushi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenoh.domosushi.models.DomoSchedule;
import com.kenoh.domosushi.repositories.DomoScheduleRepository;

@Service
public class MainService {

	@Autowired
	private DomoScheduleRepository domoscheduleRepo;
	
//	FIND ALL SCHEDULE
	public List<DomoSchedule> allSchedule(){
		return domoscheduleRepo.findAll();
	}
	
//	FIND A SCHEDULE
	public DomoSchedule findOneSchedule(Long id) {
		Optional<DomoSchedule> optionalSchedule = domoscheduleRepo.findById(id);
		if(optionalSchedule.isPresent()) {
			return optionalSchedule.get();
		}else {
			return null;
		}
	}
	
//	CREATE A SCHEDULE 
	public DomoSchedule createSchedule(DomoSchedule domoschedule) {
		return domoscheduleRepo.save(domoschedule);
	}
	
//	UPDATE SCHEDULE 
	public DomoSchedule updateSchedule(DomoSchedule domoschedule) {
		return domoscheduleRepo.save(domoschedule);
	}
	
//  DELETE SCHEDULE
	public void deleteBaby(Long id) {
		domoscheduleRepo.deleteById(id);
	}
}
