package com.scaler.blog_api.comments;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "comments")
public class CommentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    UUID id;
}
