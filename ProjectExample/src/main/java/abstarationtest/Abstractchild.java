package abstarationtest;

public class Abstractchild extends Abstract {
	public void display()
	{
		System.out.println("abstract child");
	}
public void sound()
{
	System.out.println("bow bow ");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild a=new Abstractchild();
		a.display();
		a.show();
		a.sound();

	}

}
