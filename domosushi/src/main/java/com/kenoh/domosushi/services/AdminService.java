package com.kenoh.domosushi.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.kenoh.domosushi.models.Admin;
import com.kenoh.domosushi.models.LoginAdmin;
import com.kenoh.domosushi.repositories.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	public Admin register(Admin newAdmin, BindingResult result) {
		Optional<Admin> potentialAdmin = adminRepo.findByEmail(newAdmin.getEmail());
		
//		1. CHECK EMAIL IF IT IS PRESENT, IF SO REJECT.
		if(potentialAdmin.isPresent()) {
			result.rejectValue("email", "unique", "Email already exists, please try again");
		}
		
//		2. CHECK PASSWORD AND THE CONFIRM IF IT MATCHES
		if(!newAdmin.getPassword().equals(newAdmin.getConfirm())) {
			result.rejectValue("password", "match", "Password and Confirm password do not MATCH, please try again");
		}
		
//		3. CHECK IF THE RESULT HAS ANY ERRORS, RETURN NULL (LEAVE METHOD WITHOUT SAVING)
		if(result.hasErrors()) {
			return null;
		}
		
//		4. IF EVERYTHING IS GOOD, HASH AND SET PASSWORD, SAVE USER TO THE DATABASE
		String hashed = BCrypt.hashpw(newAdmin.getPassword(), BCrypt.gensalt());
		newAdmin.setPassword(hashed);
		return adminRepo.save(newAdmin);
	}
	
	public Admin login(LoginAdmin newLogin, BindingResult result) {
//		1. FIND THE USER IN THE DATABASE BY EMAIL
		Optional<Admin> potentialAdmin = adminRepo.findByEmail(newLogin.getEmail());
		
//		2. IF EMAIL IS NOT PRESENT, RETURN NULL (REJECT IT)
		if(!potentialAdmin.isPresent()) {
			result.rejectValue("email", "unique", "Cannot find Email, please try again");
			return null;
		}
		
//		3. GET THE USER FROM THE DATABASE
		Admin admin = potentialAdmin.get();
//		IF BCRYPT PASSWORD FAILS TO MATCH, THEN REJECT IT
		if(!BCrypt.checkpw(newLogin.getPassword(), admin.getPassword())) {
			result.rejectValue("password", "matches", "Incorrect Password, please try again");
		}
		
//		4. RETURN NULL IF THE RESULT HAS ANY ERRORS
		if(result.hasErrors()) {
			return null;
		}
		return admin;
	}
	
	public Admin findOneAdmin(Long id) {
		Optional<Admin> optionalAdmin = adminRepo.findById(id);
			if(optionalAdmin.isPresent()) {
				return optionalAdmin.get();
			}else {
				return null;
			}
	}
}
