package oopConcept;

public class Employee {
	
	String empname;
	int empid;
	int empsalary;
	String empdesignation;
	static String company="Luminar";
	
	public void display()
	{
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(empsalary);
		System.out.println(empdesignation);
	}
	

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.empname="Anu";
		emp.empid=100;
		emp.empsalary=50000;
		emp.empdesignation="Tester";
		emp.display();
		System.out.println(company);
		System.out.println(Employee.company);
		
		
	}

}
