package com.qa.dota_hobby_project.persistence.dto;

public class HeroDTO {

	private Long ID;

	private String name;
	private String primaryAttribute;
	private float STR;
	private float STR_gain;
	private float AGI;
	private float AGI_gain;
	private float INT;
	private float INT_gain;
	private int minDMG;
	private int maxDMG;
	private float healthRegen;
	private float manaRegen;
	private int moveSpeed;

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

	public float getSTR() {
		return STR;
	}

	public void setSTR(float sTR) {
		STR = sTR;
	}

	public float getSTR_gain() {
		return STR_gain;
	}

	public void setSTR_gain(float sTR_gain) {
		STR_gain = sTR_gain;
	}

	public float getAGI() {
		return AGI;
	}

	public void setAGI(float aGI) {
		AGI = aGI;
	}

	public float getAGI_gain() {
		return AGI_gain;
	}

	public void setAGI_gain(float aGI_gain) {
		AGI_gain = aGI_gain;
	}

	public float getINT() {
		return INT;
	}

	public void setINT(float iNT) {
		INT = iNT;
	}

	public float getINT_gain() {
		return INT_gain;
	}

	public void setINT_gain(float iNT_gain) {
		INT_gain = iNT_gain;
	}

	public int getMinDMG() {
		return minDMG;
	}

	public void setMinDMG(int minDMG) {
		this.minDMG = minDMG;
	}

	public int getMaxDMG() {
		return maxDMG;
	}

	public void setMaxDMG(int maxDMG) {
		this.maxDMG = maxDMG;
	}

	public float getHealthRegen() {
		return healthRegen;
	}

	public void setHealthRegen(float healthRegen) {
		this.healthRegen = healthRegen;
	}

	public float getManaRegen() {
		return manaRegen;
	}

	public void setManaRegen(float manaRegen) {
		this.manaRegen = manaRegen;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	@Override
	public String toString() {
		return "HeroDTO [ID=" + ID + ", name=" + name + ", primaryAttribute=" + primaryAttribute + ", STR=" + STR
				+ ", STR_gain=" + STR_gain + ", AGI=" + AGI + ", AGI_gain=" + AGI_gain + ", INT=" + INT + ", INT_gain="
				+ INT_gain + ", healthRegen=" + healthRegen + ", manaRegen=" + manaRegen + "]";
	}

}
