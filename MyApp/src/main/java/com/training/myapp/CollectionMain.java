package com.training.myapp;

import java.util.Collection;
import java.util.HashSet;

import com.training.myapp.model.SchoolNameComparator;

public class CollectionMain {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
   HashSet<School> schools =new HashSet<School>();
   schools.add(new School("dps","hyderabad","Hyderabad",1));
   schools.add(new School("nalandha","bonglor","rangareddy",5));
   schools.add(new School("nagarjuna","saroornagar","rangareddy",2));
   schools.add(new School("nagarjuna","saroornagar","rangareddy",3));

     for(School school:schools)
     {
    	 System.out.println(school);
     }
	}

}