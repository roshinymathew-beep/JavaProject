package assignment;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		c=sc.next().charAt(0); 
		if(c>='a' && c<='z' || c>='A' && c<='Z')
		{
			System.out.println("Entered character is an alphabet");
		}
		else
		{
			System.out.println("Entered character is not an alphabet");
		}
	}
 
}
