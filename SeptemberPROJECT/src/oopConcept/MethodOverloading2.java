package oopConcept;
//same name different datatypes
public class MethodOverloading2 {
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
	double value=a+b;
	System.out.println(value);
}
	public static void main(String[] args) {
		MethodOverloading2 ob=new MethodOverloading2();
		ob.add(4, 6);
		ob.add(4,4.5);

	}

}
