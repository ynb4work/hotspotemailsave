package com.hotspot.email.hotspotemailsave.controller;

import com.hotspot.email.hotspotemailsave.entities.EmailRequest;
import com.hotspot.email.hotspotemailsave.entities.User;
import com.hotspot.email.hotspotemailsave.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/emails")
@Validated
public class EmailController {

    private final UserService userService;

    public EmailController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> addEmail(@Valid @RequestBody EmailRequest emailRequest) {
        Map<String, Object> response = new HashMap<>();
        try {
            if (!isValidEmail(emailRequest.getEmail())) {
                response.put("success", false);
                response.put("error", "Invalid email format");
                return ResponseEntity.badRequest().body(response);
            }

            User user = new User();
            user.setEmail(emailRequest.getEmail().toLowerCase().trim()); // Нормализуем email

            User savedUser = userService.saveUser(user);

            response.put("success", true);
            response.put("message", "Email added successfully");
            response.put("user", savedUser);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            response.put("success", false);
            response.put("error", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}