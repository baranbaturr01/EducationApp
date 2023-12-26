package com.baranbatur.EducationApp.repository;

import com.baranbatur.EducationApp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
