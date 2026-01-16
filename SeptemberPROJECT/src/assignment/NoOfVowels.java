package assignment;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {
		String s;
		int i,l,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
		l=s.length();
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' ||
			   s.charAt(i)=='A'||s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U')
			{
				c++;
			}
			
		}
		System.out.println("No. of vowels: "+c);

	}

}
