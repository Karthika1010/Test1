package examples;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac=new Account();
		ac.setAcc_no(123456);
		ac.setName("vasudev");
		ac.setAmount(1243.50f);
		System.out.println("Account number is:"+ac.getAcc_no());
		System.out.println("Name is:"+ac.getName());
		System.out.println("Amount is:"+ac.getAmount());
		
	}

}
