package oopConcept;

class Dogs
{
	public void barking()
	{
		System.out.println("Dog is barking" );
	}
}
class Cats extends Dogs
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class Lion extends Cats
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Cats c=new Cats();
		c.barking();
		c.sleeping();
		Lion l=new Lion();
		l.barking();
		l.sleeping();
		l.running();

	}

}
