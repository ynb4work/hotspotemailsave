package com.hotspot.email.hotspotemailsave.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Email
public class EmailDTO {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

}