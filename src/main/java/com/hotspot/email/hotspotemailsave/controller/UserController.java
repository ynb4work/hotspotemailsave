package com.hotspot.email.hotspotemailsave.controller;

import com.hotspot.email.hotspotemailsave.entities.User;
import com.hotspot.email.hotspotemailsave.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);

        // Создаем ответ с полем success
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("user", savedUser);  // можно вернуть email, если нужно

        return ResponseEntity.ok(response);
    }
}
