package com.baranbatur.EducationApp.repository;

import com.baranbatur.EducationApp.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepo extends JpaRepository<Content, Long> {
}
