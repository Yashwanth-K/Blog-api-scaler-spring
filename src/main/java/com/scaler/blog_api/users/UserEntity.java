package com.scaler.blog_api.users;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "users")
public class UserEntity {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.UUID) // Auto-generate UUID
    @Column(nullable = false) //All fields are mandatory
    UUID id; // declaring id of type UUID



}
