
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public static int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	public static int div(int i, int j) throws invalidException {
		// TODO Auto-generated method stub		
		if(i>=1)
	   return i/j;
		else
		{
			throw new invalidException("throw error");
		}
		
	}

}
