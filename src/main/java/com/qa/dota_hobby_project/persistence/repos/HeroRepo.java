package com.qa.dota_hobby_project.persistence.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dota_hobby_project.persistence.domain.Hero;

@Repository
public interface HeroRepo extends JpaRepository<Hero, Long> {
	
	// CRUD

	// CREATE HERO'S
	// READ HEROS'S
	// UPDATE HEROS'S
	// DELETE HEROS'S
	
}
