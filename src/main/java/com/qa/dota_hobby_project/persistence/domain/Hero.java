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
	private float STR;
	@NotNull
	private float STR_gain;
	@NotNull
	private float AGI;
	@NotNull
	private float AGI_gain;
	@NotNull
	private float INT;
	@NotNull
	private float INT_gain;
	@NotNull
	private int minDMG;
	@NotNull
	private int maxDMG;
	@NotNull
	private float healthRegen;
	@NotNull
	private float manaRegen;
	@NotNull
	private int moveSpeed;

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
		return "Hero [ID=" + ID + ", name=" + name + ", primaryAttribute=" + primaryAttribute + ", STR=" + STR
				+ ", STR_gain=" + STR_gain + ", AGI=" + AGI + ", AGI_gain=" + AGI_gain + ", INT=" + INT + ", INT_gain="
				+ INT_gain + ", healthRegen=" + healthRegen + ", manaRegen=" + manaRegen + "]";
	}

}
