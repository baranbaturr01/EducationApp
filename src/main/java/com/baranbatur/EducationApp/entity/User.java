package com.baranbatur.EducationApp.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    private String first_name;
    private String last_name;
    private Date register_date;
    private Date last_login_date;

}
