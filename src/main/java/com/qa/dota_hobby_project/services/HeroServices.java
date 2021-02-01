package com.qa.dota_hobby_project.services;

<<<<<<< HEAD
=======
import org.modelmapper.ModelMapper;
>>>>>>> feature-hero-sam
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.qa.dota_hobby_project.persistence.domain.Hero;
import com.qa.dota_hobby_project.persistence.dto.HeroDTO;
import com.qa.dota_hobby_project.persistence.repos.HeroRepo;
import com.qa.dota_hobby_project.utils.MyBeanUtils;

@Service
public class HeroServices {
	
	private HeroRepo repo;
	private ModelMapper mapper;
	
	@Autowired
	public HeroServices(HeroRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private HeroDTO mapToDTO(Hero hero) {
        return this.mapper.map(hero, HeroDTO.class);
    }
	
	// POST - CREATE
	public HeroDTO createHero(Hero hero) {
		this.repo.save(hero);
		return mapToDTO(hero);
	}
	
	// GET - READALL
	public List<HeroDTO> readAll() {
		List<Hero> heroList = this.repo.findAll();
		List<HeroDTO> heroListDTO = heroList.stream().map(this::mapToDTO).collect(Collectors.toList());
		
		return heroListDTO;
	}
	
	// GET - READ
	public HeroDTO readHero(Long id) {
		return this.mapToDTO(this.repo.findById(id).orElseThrow());
	}
	
	// PUT - UPDATE
	public HeroDTO updateHero(Long id, Hero hero) {
		Hero updatedHero = this.repo.findById(id).orElseThrow();
		MyBeanUtils.mergeNotNull(hero, updatedHero);
		return this.mapToDTO(this.repo.save(updatedHero));
	}
	
	// DELETES
	public boolean deleteHero(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
