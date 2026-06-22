package com.docker_network.service;

import org.springframework.stereotype.Service;

import com.docker_network.entity.Registration;
import com.docker_network.repository.RegistrationRepository;

@Service
public class RegistrationService {
	private RegistrationRepository registrationRepo;
	public RegistrationService(RegistrationRepository registrationRepo) {
		this.registrationRepo=registrationRepo;
	}

	public void savedRegistrationDetails(Registration registration) {
		registrationRepo.save(registration);
		
			
	}

}
