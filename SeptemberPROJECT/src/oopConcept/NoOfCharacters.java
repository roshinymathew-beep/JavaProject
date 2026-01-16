package oopConcept;

import java.util.Scanner;

public class NoOfCharacters {

	public static void main(String[] args) {
		String s;
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
		l=s.length();
		System.out.println("No. of characters: "+l
		);
		
	}

}
