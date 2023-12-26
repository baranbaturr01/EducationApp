package com.baranbatur.EducationApp.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private User instructor;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creation_date;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    private String duration;
    private boolean is_active;

}
