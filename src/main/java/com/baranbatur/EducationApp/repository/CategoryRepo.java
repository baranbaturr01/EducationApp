package com.baranbatur.EducationApp.repository;

import com.baranbatur.EducationApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
