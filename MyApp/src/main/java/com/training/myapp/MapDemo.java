package com.training.myapp;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String ,String> map = new HashMap<String, String>();
		
		// TODO Auto-generated method stub
    map.put("piter","apple");
    map.put("william","orange");
    map.put("don","grapes");
    map.put("jon","goa");
    map.put("max","apple");
    map.put("johnson","mango");
    System.out.println(map);
  // System.out.println(map.put("william", "mango"));
    //System.out.println(map);

   // Set<String> s = map.keySet();
	//System.out.println(s);
   // Collection<String> names = map.valuesCollection();
	//System.out.println(names);
  // System.out.println(map.get("jon"));
    System.out.println(map.remove("jon"));
    System.out.println(map);
	}

}


