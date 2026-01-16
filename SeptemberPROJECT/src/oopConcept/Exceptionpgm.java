package oopConcept;

public class Exceptionpgm {

	public static void main(String[] args) {
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());
		}
		System.out.println("completed");

	}

}
