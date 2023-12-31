package com.baranbatur.EducationApp.service;

import com.baranbatur.EducationApp.entity.User;
import com.baranbatur.EducationApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    

}
