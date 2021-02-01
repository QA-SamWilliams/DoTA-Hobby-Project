package com.qa.dota_hobby_project.persistence.dto;

public class ItemDTO {

	private Long ID;
	private String name;
	

	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "ItemDTO [ID=" + ID + ", name=" + name + "]";
	}

}
