package com.training.myapp;

import java.util.Comparator;

public class Television implements Comparable<Television>
{
	private String companyName;
	private String typeName;
	private double tvPrice;
	private boolean Enable3d;
	public Television() {
		super();
	}
	public Television(String companyName, String typeName, double tvPrice, boolean enable3d) {
		super();
		this.companyName = companyName;
		this.typeName = typeName;
		this.tvPrice = tvPrice;
		Enable3d = enable3d;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public double getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(double tvPrice) {
		this.tvPrice = tvPrice;
	}
	public boolean isEnable3d() {
		return Enable3d;
	}
	public void setEnable3d(boolean enable3d) {
		Enable3d = enable3d;
	}
	@Override
	public String toString() {
		return "Television [companyName=" + companyName + ", typeName=" + typeName + ", tvPrice=" + tvPrice
				+ ", Enable3d=" + Enable3d + "]";
	}
	
	public int compareTo(Television o) {
		// TODO Auto-generated method stub
		return this.companyName.compareTo(o.companyName);
	}
	
	

}
