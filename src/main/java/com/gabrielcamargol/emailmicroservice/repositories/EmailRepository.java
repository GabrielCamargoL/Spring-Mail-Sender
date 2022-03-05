package com.gabrielcamargol.emailmicroservice.repositories;

import com.gabrielcamargol.emailmicroservice.models.EmailModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
  
}
