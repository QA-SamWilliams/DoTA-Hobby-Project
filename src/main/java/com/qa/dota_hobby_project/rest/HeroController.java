package com.qa.dota_hobby_project.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dota_hobby_project.persistence.domain.Hero;
import com.qa.dota_hobby_project.persistence.dto.HeroDTO;
import com.qa.dota_hobby_project.services.HeroServices;

@RestController
@RequestMapping("/hero")
public class HeroController {
	
	private HeroServices service;
	
	public HeroController(HeroServices service) {
        super();
        this.service = service;
    }
	
	// POST
	@PostMapping("/create")
	public ResponseEntity<HeroDTO> create(@RequestBody Hero hero) {
		return new ResponseEntity<HeroDTO>(this.service.createHero(hero), HttpStatus.CREATED);
	}
	
	// GET ALL
	@GetMapping("/readAll")
	public ResponseEntity<List<HeroDTO>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}
	
	// GET
	@GetMapping("/read/{id}")
	public HeroDTO readHero(@PathVariable("id")Long id) {
		return this.service.readHero(id);
	}
	
	// PUT
	@PutMapping("/update/{id}")
	public ResponseEntity<HeroDTO> updateHero(@PathVariable("id")Long id, @RequestBody Hero hero) {
        return new ResponseEntity<>(this.service.updateHero(id, hero), HttpStatus.ACCEPTED);
	}
	
	// DELETE
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HeroDTO> deleteHero(@PathVariable Long id) {
		return this.service.deleteHero(id) ?
				new ResponseEntity<>(HttpStatus.NO_CONTENT) :
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
