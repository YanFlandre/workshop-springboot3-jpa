package com.yanflandre.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanflandre.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
