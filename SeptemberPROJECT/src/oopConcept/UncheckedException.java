package oopConcept;

public class UncheckedException {

	public static void main(String[] args) {
		//Arithmetic exception
	/*	int a=10,b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("Stopped");*/
		
		//Null pointer exception
	/*	String name=null;
		System.out.println(name.length());*/
		
		//Array index Out of bound exception
		int a[]=new int[4];
		System.out.println(a[5]);
	}

}
