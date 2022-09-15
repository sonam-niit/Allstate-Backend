package com.allsttae.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String hello() {
		return "Hello World to the World";
	}
	@GetMapping("/protected")
	public String loggedInUser() {
		return "Hello World to the Registered User";
	}
	@GetMapping("/admin")
	public String adminUser() {
		return "Hello World to the Admin User";
	}
	
}
