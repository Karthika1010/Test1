package examplepolymorphism;

public class Bike extends Vehicle {

	public void run()//method overriding
	{
		System.out.println("Go slow");
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.run();
		Vehicle v=new Vehicle();
		v.run();

	}

}
