package com.kenoh.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	@RequestMapping("/")
	public String search(
			@RequestParam(value="name", required = false) String name,
			@RequestParam(value="lastname", required = false) String lastname) {
		return "Hello " + name + " " + lastname;
	}
}
