package com.training.myapp.model;

public class Car {
	private int carid;
	private String carname;
	private String carcolour;
	private double carprice;
	public Car() {
		super();
	}
	public Car(int carid, String carname, String carcolour, double carprice) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.carcolour = carcolour;
		this.carprice = carprice;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarcolour() {
		return carcolour;
	}
	public void setCarcolour(String carcolour) {
		this.carcolour = carcolour;
	}
	public double getCarprice() {
		return carprice;
	}
	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "Bike [carid=" + carid + ", carname=" + carname + ", carcolour=" + carcolour + ", carprice=" + carprice
				+ "]";
	}
	
	

}
