package com.baranbatur.EducationApp.repository;

import com.baranbatur.EducationApp.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepo extends JpaRepository<Exam, Long> {
}
