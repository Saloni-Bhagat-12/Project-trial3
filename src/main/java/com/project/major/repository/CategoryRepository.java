package com.project.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
