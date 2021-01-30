package com.qa.dota_hobby_project.persistence.dto;

public class HeroDTO {

	private Long ID;

	private String name;
	private String primaryAttribute;
	private String localizedName;
	

	public HeroDTO() {
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

	@Override
	public String toString() {
		return "HeroDTO [ID=" + ID + ", name=" + name + ", primaryAttribute=" + primaryAttribute + ", localizedName="
				+ localizedName + "]";
	}

}
