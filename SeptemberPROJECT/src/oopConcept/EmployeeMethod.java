package oopConcept;

public class EmployeeMethod {
	
	int empid;
	int salary;
	String designation;
	public void setvalues(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}
	/*public void setvalues(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
		
	}*/
	public void display()
	{
		System.out.println("empid:"+empid);
		System.out.println("salary"+salary);
		System.out.println("designation"+designation);
	}

	public static void main(String[] args) {
		EmployeeMethod emp=new EmployeeMethod();
		emp.setvalues(100, 40000, "designer");
		emp.display();
		
	}

}
