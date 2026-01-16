package oopConcept;
// different no. of parameters
public class MetodOverloading {

	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		MetodOverloading mo=new MetodOverloading();
		mo.add(3,4);
		mo.add(4,5,6);

	}

}
