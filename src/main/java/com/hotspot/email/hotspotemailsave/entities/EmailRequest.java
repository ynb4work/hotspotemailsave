package com.hotspot.email.hotspotemailsave.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailRequest {

    // Геттеры и сеттеры
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

}
