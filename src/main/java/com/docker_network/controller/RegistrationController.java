package com.docker_network.controller;


import org.springframework.web.bind.annotation.*;
import com.docker_network.entity.Registration;
import com.docker_network.service.RegistrationService;

@RestController
@RequestMapping
public class RegistrationController {

	private RegistrationService registrationService;
	public RegistrationController(RegistrationService registrationService) {
		this.registrationService= registrationService;
	}
	
	@GetMapping
	public String welcomeInOrg() {
		return "WELCOME TO OUR ORGANIZATION!";
	}
	
	@PostMapping("/register")
	public String savedRegistrationDetails(@RequestBody Registration registration) {
		registrationService.savedRegistrationDetails(registration);
		
		return null;
		
	}
}
