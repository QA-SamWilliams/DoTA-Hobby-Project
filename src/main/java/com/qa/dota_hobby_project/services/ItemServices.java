package com.qa.dota_hobby_project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.qa.dota_hobby_project.persistence.domain.Item;
import com.qa.dota_hobby_project.persistence.dto.ItemDTO;
import com.qa.dota_hobby_project.persistence.repos.ItemRepo;
import com.qa.dota_hobby_project.utils.MyBeanUtils;

@Service
public class ItemServices {
	
	private ItemRepo repo;
	private ModelMapper mapper;
	
	@Autowired
	public ItemServices(ItemRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private ItemDTO mapToDTO(Item hero) {
        return this.mapper.map(hero, ItemDTO.class);
    }
	
	// POST - CREATE
	public ItemDTO createItem(Item hero) {
		this.repo.save(hero);
		return mapToDTO(hero);
	}
	
	// GET - READALL
	public List<ItemDTO> readAll() {
		List<Item> heroList = this.repo.findAll();
		List<ItemDTO> heroListDTO = heroList.stream().map(this::mapToDTO).collect(Collectors.toList());
		
		return heroListDTO;
	}
	
	// GET - READ
	public ItemDTO readItem(Long id) {
		return this.mapToDTO(this.repo.findById(id).orElseThrow());
	}
	
	// PUT - UPDATE
	public ItemDTO updateItem(Long id, Item hero) {
		Item updatedItem = this.repo.findById(id).orElseThrow();
		MyBeanUtils.mergeNotNull(hero, updatedItem);
		return this.mapToDTO(this.repo.save(updatedItem));
	}
	
	// DELETES
	public boolean deleteItem(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
