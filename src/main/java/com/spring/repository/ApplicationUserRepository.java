package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
	ApplicationUser findByUsername(String username);
}
