package com.hotspot.email.hotspotemailsave.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        schema = "hotspot",
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email", name = "unique_email_constraint")
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;
}