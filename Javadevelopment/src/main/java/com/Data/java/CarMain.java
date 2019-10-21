package com.Data.java;

import java.util.HashSet;
import java.util.TreeSet;

public class CarMain {

	public static void main(String[] args) {
		TreeSet<Car> vachile = new TreeSet<Car>();
		// TODO Auto-generated method stub
vachile.add(new Car("creta","aed",1995,1550000));
vachile.add(new Car("bMW","zfcghg",2000,8080000));
vachile.add(new Car("scoda rapid","oiopupo",2004,1230000));

    for (Car c:vachile)
    {
System.out.println(c);
	}

	}
}

