package assignment;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		String s,r="";
		int l;
		char ch;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		l=s.length();
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			r=ch+r;
		}
		System.out.println("Reversed string is "+r);
	}

}
