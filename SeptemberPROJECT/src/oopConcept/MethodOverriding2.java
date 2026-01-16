package oopConcept;

class Parent
{
	String name="abc";
	public void phone()
	{
		System.out.println("Nokia");
	}
}
class Child extends Parent
{
	public void phone()
	{
		System.out.println(super.name);// To access parent class variable
		super.phone(); //To access parent class method
		System.out.println("iphone");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.phone();
		

	}

}
