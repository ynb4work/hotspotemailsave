package com.hotspot.email.hotspotemailsave.repository;


import com.hotspot.email.hotspotemailsave.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}