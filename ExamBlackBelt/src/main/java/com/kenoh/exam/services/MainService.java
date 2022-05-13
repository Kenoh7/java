package com.kenoh.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenoh.exam.models.Baby;
import com.kenoh.exam.models.User;
import com.kenoh.exam.repositories.BabyRepository;

@Service
public class MainService {
	@Autowired
	private BabyRepository babyRepo;
	
	@Autowired
	private UserService userService;
	
//	FIND ALL BABY NAMES
	public List<Baby> allBabys(){
		return babyRepo.findAll();
	}
	
//	FIND A BABY NAME
	public Baby findOneBaby(Long id) {
		Optional<Baby> optionalBaby = babyRepo.findById(id);
		if(optionalBaby.isPresent()) {
			return optionalBaby.get();
		}else {
			return null;
		}
	}
	
//	CREATE A BABY NAME
	public Baby createBaby(Baby baby) {
		return babyRepo.save(baby);
	}
	
//	UPDATE BABY NAME
	public Baby updateBaby(Baby baby) {
		return babyRepo.save(baby);
	}
	
//  DELETE BABY NAME
	public void deleteBaby(Long id) {
		babyRepo.deleteById(id);
	}

//	UP VOTE BABY
	public void voteBaby(Long babyId, Long userId) {
		User user = userService.findOneUser(userId);
		Baby baby = this.findOneBaby(babyId);
		baby.getVotedUsers().add(user);
		babyRepo.save(baby);
	}
	
//	UN-VOTE BABY
	public void unvotedBaby(Long babyId, Long userId) {
		User user = userService.findOneUser(userId);
		Baby baby = this.findOneBaby(babyId);
		baby.getVotedUsers().remove(user);
		babyRepo.save(baby);
	}
}
