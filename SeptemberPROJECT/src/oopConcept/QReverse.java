package oopConcept;

import java.util.Scanner;

public class QReverse {

	public static void main(String[] args) {

		String s,r="";
		char c;
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
		l=s.length();
		for(int i=0;i<l;i++)
		{
			c=s.charAt(i);
			r=c+r;
		}
			
		System.out.println("Reversed string: "+r);
		

	}

}
