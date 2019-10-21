package com.Data.java;

public class Rectangle<area> 
{
	int l;
	int w;
	Rectangle(int l, int w)
	{
		this.l=1;
		this.w=w;
		
	}
	public void getArea()
	{
	int res=l*w;
	System.out.println("area of the rectangle"+res);
	
	}
	public void getperimeter()
	{
		int res=2*l*w;
		System.out.println("perimeter of the rectangle"+res);
	}
	

}
class DrawingApp
{
 public static void mein (String[] args)
 {
	 Rectangle r1=new Rectangle(10,6);
	 Rectangle r2=new Rectangle(8,12);
	 System.out.println(r1.this.L*this.w);
	 System.out.println(r2.this.L*this.w);
 }
}

