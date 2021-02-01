package com.qa.dota_hobby_project.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@ManyToOne
	private Item items;
	@NotNull
	private String name;
	@NotNull
	private String primaryAttribute;
	@NotNull
	private String localizedName;
	
	public Hero(Long iD, Item items, String name, String primaryAttribute, String localizedName) {
		super();
		ID = iD;
		this.items = items;
		this.name = name;
		this.primaryAttribute = primaryAttribute;
		this.localizedName = localizedName;
	}
	
	
	
}
