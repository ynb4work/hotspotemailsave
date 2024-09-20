package com.hotspot.email.hotspotemailsave.controller;

import com.hotspot.email.hotspotemailsave.entities.EmailRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emails")
@Validated
public class EmailController {
    @PostMapping
    public ResponseEntity<String> addEmail(@Valid @RequestBody EmailRequest emailRequest) {
        // Логика добавления email в базу данных
        return ResponseEntity.ok("Email added successfully");
    }
}
