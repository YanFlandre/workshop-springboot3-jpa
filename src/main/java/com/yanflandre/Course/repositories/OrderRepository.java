package com.yanflandre.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanflandre.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
