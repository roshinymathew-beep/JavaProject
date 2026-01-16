package oopConcept;
//Single Inheritance
class Dog
{
	public void barking()
	{
		System.out.println("Dog is barking" );
	}
}
class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
public class AnimalInheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.barking();
		c.sleeping();

	}

}
