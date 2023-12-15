package exception;

public class ThrowExampleTest {
public static void check(int a,int b)
{
	int c=a+b;
	if( c>100)
	{
	throw new ArithmeticException("sum is greater than 100");
}
	else
	{
	System.out.println("sum is less than 100");	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	
check(10,50);
	
}
catch(ArithmeticException e) {
	System.out.println(e);
}
System.out.println("hello");

	}

}
