package Sample.lambda;

import java.util.ArrayList;
//import java.util.zip.Inflater;

class SampleLa {
	public static void main(String[] args) {
		 ArrayList<Integer> arrl=new ArrayList<Integer>();
		 arrl.add(1);
		 arrl.add(2);
		 arrl.add(3);
		 arrl.add(4);
	     arrl.add(5);
		 //lambda expression to print all the array elements
		 arrl.forEach(n-> System.out.println(n));
		 //lambda expression to print the array elements divided by 2
	     arrl.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
    } 
	}


