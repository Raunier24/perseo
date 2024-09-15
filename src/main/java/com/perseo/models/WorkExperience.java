package com.perseo.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "work_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String position;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters y Setters
}
