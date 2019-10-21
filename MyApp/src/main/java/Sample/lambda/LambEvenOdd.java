package Sample.lambda;


	interface EvenOdd {
		void check(int a);
	}

	public class LambEvenOdd {
		public static void main1(String[] args) 
		{
		EvenOdd evenOdd = (int a) -> {
		if(a%2==0)
		{
		System.out.println("Number "+a+" is even.");
		} 
		else
		{
					System.out.println("Number "+a+" is odd.");
				}
			};
			evenOdd.check(43);
			evenOdd.check(30);
			evenOdd.check(5);
			evenOdd.check(8);
		}
	

}

