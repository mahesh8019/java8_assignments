package com.Data.java;

public class Car implements Comparable<Car> {
	private String makeCompanyName;
	private String modelName;
	private int year;
	private double priceOfTheCar;
	public Car() {
		super();
	}
	public Car(String makeCompanyName, String modelName, int year, double priceOfTheCar) {
		super();
		this.makeCompanyName = makeCompanyName;
		this.modelName = modelName;
		this.year = year;
		this.priceOfTheCar = priceOfTheCar;
	}
	
	public String getMakeCompanyName() {
		return makeCompanyName;
	}
	public void setMakeCompanyName(String makeCompanyName) {
		this.makeCompanyName = makeCompanyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPriceOfTheCar() {
		return priceOfTheCar;
	}
	public void setPriceOfTheCar(double priceOfTheCar) {
		this.priceOfTheCar = priceOfTheCar;
	}
	@Override
	public String toString() {
		return "Car [makeCompanyName=" + makeCompanyName + ", modelName=" + modelName + ", year=" + year
				+ ", priceOfTheCar=" + priceOfTheCar + "]";
	}
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.modelName.compareTo(o.modelName);
	}
	

}
