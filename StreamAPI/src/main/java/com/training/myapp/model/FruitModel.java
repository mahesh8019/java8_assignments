package com.training.myapp.model;

public class FruitModel {
	private String fruitName;
	private int fruitCalouries;
	private int fruitPrice;
	private String fruitColour;
	public FruitModel() {
		super();
	}
	public FruitModel(String fruitName, int fruitCalouries, int fruitPrice, String fruitColour) {
		super();
		this.fruitName = fruitName;
		this.fruitCalouries = fruitCalouries;
		this.fruitPrice = fruitPrice;
		this.fruitColour = fruitColour;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getFruitCalouries() {
		return fruitCalouries;
	}
	public void setFruitCalouries(int fruitCalouries) {
		this.fruitCalouries = fruitCalouries;
	}
	public int getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(int fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	public String getFruitColour() {
		return fruitColour;
	}
	public void setFruitColour(String fruitColour) {
		this.fruitColour = fruitColour;
	}
	@Override
	public String toString() {
		return "FruitModel [fruitName=" + fruitName + ", fruitCalouries=" + fruitCalouries + ", fruitPrice="
				+ fruitPrice + ", fruitColour=" + fruitColour + "]";
	}
	
	
	

}
