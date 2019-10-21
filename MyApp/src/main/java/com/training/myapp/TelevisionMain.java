package com.training.myapp;

import java.util.Collection;
import java.util.HashSet;

public class TelevisionMain {

	public static void main(String[] args) {
		HashSet<Television> tele = new HashSet<Television>();
		// TODO Auto-generated method stub
tele.add(new Television("samsang","LCD",1500.00,true));
tele.add(new Television("LG","LED",1300.00,false));
tele.add(new Television("mi","plasma",22000.00,true));
tele.add(new Television("sansui","led",11000.00,false));
tele.add(new Television("onida","plasma",18000.00,true));
tele.add(new Television("motorolla","LCD",17000.00, true));
tele.add(new Television("","plasma",16000.00,false));
tele.add(new Television("mi","plasma",31000.00,true));

    for (Television tv:tele)
    {
System.out.println(tv);
	}

	}
}

	
