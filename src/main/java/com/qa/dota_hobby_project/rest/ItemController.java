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

import com.qa.dota_hobby_project.persistence.domain.Item;
import com.qa.dota_hobby_project.persistence.dto.ItemDTO;
import com.qa.dota_hobby_project.services.ItemServices;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	private ItemServices service;
	
	public ItemController(ItemServices service) {
        super();
        this.service = service;
    }
	
	// POST
	@PostMapping("/create")
	public ResponseEntity<ItemDTO> create(@RequestBody Item item) {
		return new ResponseEntity<ItemDTO>(this.service.createItem(item), HttpStatus.CREATED);
	}
	
	// GET ALL
	@GetMapping("/readAll")
	public ResponseEntity<List<ItemDTO>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}
	
	// GET
	@GetMapping("/read/{id}")
	public ItemDTO readItem(@PathVariable("id")Long id) {
		return this.service.readItem(id);
	}
	
	// PUT
	@PutMapping("/update/{id}")
	public ResponseEntity<ItemDTO> updateItem(@PathVariable("id")Long id, @RequestBody Item item) {
        return new ResponseEntity<>(this.service.updateItem(id, item), HttpStatus.ACCEPTED);
	}
	
	// DELETE
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ItemDTO> deleteItem(@PathVariable Long id) {
		return this.service.deleteItem(id) ?
				new ResponseEntity<>(HttpStatus.NO_CONTENT) :
				new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
