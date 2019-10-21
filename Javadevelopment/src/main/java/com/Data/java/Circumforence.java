package com.Data.java;

public class Circumforence {
	int r;
	static double pi=3.14;
	public void getArea()
	{
		double res=pi*this.r*this.r;
		System.out.println("area of circle"+res);
	}
	public void getCircumforence()
	{
	double res=2*pi*this.r;
	System.out.println("circumforence of circle is "+ res);
	}
public static void main(String[] args)
{
	Circumforence c1= new Circumforence();
	Circumforence c2= new Circumforence();
	c1.r=9;
	c2.r=8;
	c1.getArea();
	c2.getArea();
	c1.getCircumforence();
	c2.getCircumforence();
	


}

}
	
