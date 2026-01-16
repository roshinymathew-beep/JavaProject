package oopConcept;

public class Constructor {
int salary;
String designation;

//Parameterized constructor
public Constructor(int sal,String desig)
{
	salary=sal; 
	designation=desig;     
}

//default constructor
/*public Constructor()
{
	salary=10000000; 
	designation="HR";
}*/
	public static void main(String[] args) {
	//	Constructor c=new Constructor();
		Constructor c=new Constructor(10000000,"HR");
		System.out.println(c.salary);
		System.out.println(c.designation);
	}

}
