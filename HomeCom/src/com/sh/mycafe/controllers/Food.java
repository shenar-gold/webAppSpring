package com.sh.mycafe.controllers;

import java.util.List;

public class Food {

	private String foodName;
	private String ingredients;
	private String breadType;
	
	public void setFoodName(String fn) {
		this.foodName = fn;
	}
	
	public void setIngredients(String ing) {
		this.ingredients = ing;
	}
	
	public void setBreadType(String bt) {
		this.breadType = bt; 
	}
	
	public String getFoodName() {
		return this.foodName;
	}
	
	public String getIngredients(){
		return this.ingredients;
	}
	
	public String getBreadType() {
		return this.breadType;
	}
}
