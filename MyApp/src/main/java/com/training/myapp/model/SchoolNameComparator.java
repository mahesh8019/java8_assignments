package com.training.myapp.model;

import java.util.Comparator;

import com.training.myapp.School;

public  class SchoolNameComparator implements Comparator<School>{

	public int compare(School o1, School o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getSchoolRank(),o1.getSchoolRank());
	}


}
