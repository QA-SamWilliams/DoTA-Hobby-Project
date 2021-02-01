package com.qa.dota_hobby_project.persistence.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dota_hobby_project.persistence.domain.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
	
	// CRUD

	// CREATE ITEM'S
	// READ HEROS'S
	// UPDATE HEROS'S
	// DELETE HEROS'S
	
}
