package oopConcept;

class Member
{
	String name,address;
	int age,salary;
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
	}
}
class Worker extends Member
{
	String specialization;
	public void display()
	{
		System.out.println(specialization);
	}
}
class Manager extends Member
{
	String dept;
	public void display()
	{
		System.out.println(dept);
	}
}
public class Emp {

	public static void main(String[] args) {
		Worker w=new Worker();
		w.name="John";
		w.age=35;
		w.address="Ekm";
		w.salary=25000;
		w.specialization="Designing";
		Manager m=new Manager();
		m.name="Sam";
		m.age=40;
		m.address="Tvm";
		m.salary=50000;
		m.dept="HR";
		System.out.println("Worker Details:");
		w.printdetails();
		w.display();
		System.out.println("Manager Details:");
		m.printdetails();
		m.display();

	}

}
