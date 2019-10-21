package Sample.lambda;

public class Lambda {

		interface FunctionalInterface 
		{ 
		  void abstractFunction(int x); 
		  default void normalFun() 
		  { 
		  System.out.println("Hello"); 
		} 
		}   
		class Test 
		{ 
	     public void main(String args[]) 
		 {    
		  FunctionalInterface funobj = (int x)->System.out.println(2*x);  
		  funobj.abstractFunction(5); 
		    } 
		} 
	}

