package multilevel;

public class Puppy extends Dog {

	public void sound()
	{
		System.out.println("Second child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy p=new Puppy();
		p.sound();
		Dog d=new Dog();
		d.sound();
		Animal a=new Animal();
		a.eat();
		
		
	}

}
