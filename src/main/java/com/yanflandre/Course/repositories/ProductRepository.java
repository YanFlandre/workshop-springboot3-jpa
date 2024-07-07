package com.yanflandre.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanflandre.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
