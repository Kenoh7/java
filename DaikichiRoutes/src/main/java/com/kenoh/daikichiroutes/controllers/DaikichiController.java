package com.kenoh.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String daikichiToday() {
		return "Today you will find luck in all your endeavors!!";
	}
	
	@RequestMapping("/tomorrow")
	public String daikichiTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{location}")
	public String location(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location;
	}
	
	@RequestMapping("/lotto/{number}")
	public String number(@PathVariable("number") Integer number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}