package com.qa.dota_hobby_project.persistence.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroDTO {

	private Long ID;
	
	private String name;
	private String primaryAttribute;
	private String localizedName;
	
	private List<ItemDTO> itemList;

}
