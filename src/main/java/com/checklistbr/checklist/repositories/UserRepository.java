package com.checklistbr.checklist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checklistbr.checklist.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
