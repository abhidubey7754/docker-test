package com.docker_network.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker_network.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
