package com.yanflandre.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanflandre.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
