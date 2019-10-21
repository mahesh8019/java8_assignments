package com.training.myapp;

import java.util.Comparator;

public class School implements Comparator<School>{
	private static final int Integer = 0;
	private String schoolName;
	private String schoolCity;
	private String schoolDistrict;
	private int schoolRank;

	

	public School() {
		super();
	}

	public School(String schoolName, String schoolCity, String schoolDistrict, int schoolRank) {
		super();
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.schoolDistrict = schoolDistrict;
		this.schoolRank = schoolRank;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getSchoolRank() {
		return schoolRank;
	}

	public void setSchoolRank(int schoolRank) {
		this.schoolRank = schoolRank;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolCity=" + schoolCity + ", schoolDistrict=" + schoolDistrict
				+ ", schoolRank=" + schoolRank + "]";
	}

	public int compareTo(School o) {
		// TODO Auto-generated method stub
		return (this.schoolRank-o.schoolRank);	}
//
//	public int compare(School o1, School o2) {
//		// TODO Auto-generated method stub
//		return 0;

	//public int compare(int o1, int o2) {
		// TODO Auto-generated method stub
		//return Integer compare(o2.getSchoolRank(), o1.getSchoolRank());
	}
	
	

