package com.baranbatur.EducationApp.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content_type; // video or text or quiz
    private String content_data;// video url or text or quiz  datas
    private int content_order;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Temporal(TemporalType.TIMESTAMP)
    private Date publish_date;

}
