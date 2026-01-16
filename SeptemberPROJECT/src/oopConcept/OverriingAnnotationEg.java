package oopConcept;

class Car
{
	public void speed()
	{
		System.out.println("Car speed");
	}
	public void power()
	{
		System.out.println("Car power");
	}
}

class BMW extends Car
{

	@Override   //Annotation for security
	public void speed() {
		System.out.println("BMW Speed");
		super.speed();
	}

	@Override
	public void power() {
		System.out.println("BMW Power");
		super.power();
	}
	
}
public class OverriingAnnotationEg {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.speed();
		b.power();
	}

}
