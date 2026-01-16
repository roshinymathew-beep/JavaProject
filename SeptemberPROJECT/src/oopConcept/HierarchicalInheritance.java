package oopConcept;

class Dog1
{
	public void barking()
	{
		System.out.println("Dog is barking" );
	}
}
class Cat1 extends Dog
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class Lion1 extends Dog
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Cat1 c=new Cat1();
		c.barking();
		c.sleeping();
		Lion1 l=new Lion1();
		l.barking();
		l.running();
	}

}
