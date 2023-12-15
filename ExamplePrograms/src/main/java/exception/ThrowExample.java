package exception;

public class ThrowExample {

	public static void validate(int age)
	{
		if(age>18)
		{
			throw new ArithmeticException("Eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(14);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code");
		
	}

}
