package com.qa.dota_hobby_project.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@NotNull
	private String name;
	@NotNull
	private String primaryAttribute;
	@NotNull
	private String localizedName;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryAttribute() {
		return primaryAttribute;
	}

	public void setPrimaryAttribute(String primaryAttribute) {
		this.primaryAttribute = primaryAttribute;
	}
	
	public String getLocalizedName() {
		return localizedName;
	}
	
	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}
}
