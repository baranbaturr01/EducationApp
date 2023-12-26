package com.baranbatur.EducationApp.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private int question_count;
    private Date start_date;
    private Date end_date;
    private String valid_time;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Question> questions;
}
