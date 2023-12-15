package heirarchical;

public class Parrot extends Birds {

	public void eat()
	{
		System.out.println("Eating Milletes");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p=new Parrot();
		p.sing();
		p.eat();

	}

}
