package com.training.myapp;

import java.util.Comparator;

public class TelevisionComparator implements Comparator<Television> {
	public int compare(Television o1, Television o2)
	{
		//return Integer.compare(o1.getCompanyName(),o2.getCompanyName());
		return o1.getCompanyName().compareTo(o2.getCompanyName());
	}

}
