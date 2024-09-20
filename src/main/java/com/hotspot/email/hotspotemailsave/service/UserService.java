package com.hotspot.email.hotspotemailsave.service;

import com.hotspot.email.hotspotemailsave.entities.User;
import com.hotspot.email.hotspotemailsave.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}