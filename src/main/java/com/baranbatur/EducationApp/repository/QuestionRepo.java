package com.baranbatur.EducationApp.repository;

import com.baranbatur.EducationApp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
