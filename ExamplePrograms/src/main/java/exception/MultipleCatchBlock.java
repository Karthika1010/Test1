package exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[10];
			a[15]=25;
			int b=20/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occurs");
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
			
		}
		System.out.println("rest of the code");

	}

}
