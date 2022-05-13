package com.kenoh.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.kenoh.bookclub.models.LoginUser;
import com.kenoh.bookclub.models.User;
import com.kenoh.bookclub.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		
//		1. CHECK EMAIL IF IT IS PRESENT, IF SO REJECT.
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "unique", "Email already exists, please try again");
		}
		
//		2. CHECK PASSWORD AND THE CONFIRM IF IT MATCHES
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "match", "Password and Confirm password do not MATCH, please try again");
		}
		
//		3. CHECK IF THE RESULT HAS ANY ERRORS, RETURN NULL (LEAVE METHOD WITHOUT SAVING)
		if(result.hasErrors()) {
			return null;
		}
		
//		4. IF EVERYTHING IS GOOD, HASH AND SET PASSWORD, SAVE USER TO THE DATABASE
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
//		1. FIND THE USER IN THE DATABASE BY EMAIL
		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
		
//		2. IF EMAIL IS NOT PRESENT, RETURN NULL (REJECT IT)
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "unique", "Cannot find Email, please try again");
			return null;
		}
		
//		3. GET THE USER FROM THE DATABASE
		User user = potentialUser.get();
//		IF BCRYPT PASSWORD FAILS TO MATCH, THEN REJECT IT
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password", "matches", "Incorrect Password, please try again");
		}
		
//		4. RETURN NULL IF THE RESULT HAS ANY ERRORS
		if(result.hasErrors()) {
			return null;
		}
		return user;
	}
	
	public User findOneUser(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
			if(optionalUser.isPresent()) {
				return optionalUser.get();
			}else {
				return null;
			}
	}
}
