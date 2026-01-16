package oopConcept;
//changing the order of parameter
public class MethodOverloading3 {
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double value=a+b;
		System.out.println(value);
	}
	public static void main(String[] args) {
		 MethodOverloading3 ob=new  MethodOverloading3();
		 ob.add(3,4.5);
		 ob.add(5.5, 4);

	}

}
