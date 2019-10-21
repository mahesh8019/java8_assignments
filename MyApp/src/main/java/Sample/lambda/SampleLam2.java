package Sample.lambda;


import com.training.myapp.MainDate;



	interface Functionalinterface1
	{
		int Operation(int a, int b);

	}
	public class SampleLam2 {

	
	public static void main(String args[])
	{
	    Functionalinterface1 division = (x,y)->x / y;
	    Functionalinterface1 substraction = (x,y)-> x - y;
		Functionalinterface1 multiplay = (x,y)-> x * y;
		Functionalinterface1 addition = (x,y)-> x + y;
		System.out.println(division.Operation(30, 5));
		System.out.println(substraction.Operation(10, 5));
		System.out.println(multiplay.Operation(3, 2));
		System.out.println(addition.Operation(10, 3));
		
	}
	
    } 
    
	
