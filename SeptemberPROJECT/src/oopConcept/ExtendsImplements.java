package oopConcept;

class Monkey
{
	public void jump()
	{
		System.out.println("Monkey jumps");
	}
	public void bite()
	{
		System.out.println("Monkey bites");
	}
}
interface BasicAnimal
{
	void cat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal
{

	@Override
	public void cat() {

		System.out.println("Cat is a basic animal");
		
	}

	@Override
	public void sleep() {

		System.out.println("Basic animal sleeps");
		
	}
	public void speak()
	{
		System.out.println("Human speaks");
	}
	
}
public class ExtendsImplements {

	public static void main(String[] args) {
		Human H=new Human();
		H.jump();
		H.bite();
		H.speak();
		H.cat();
		H.sleep();
		
	}

}
