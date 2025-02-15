package com.scaler.blog_api.blogs;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "blogs")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    UUID id;
}
