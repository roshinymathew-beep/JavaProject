package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,s=0,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. :");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		//System.out.println(s);
		if(s==t)
			System.out.println("The entered no. is palindrome");
		else
			System.out.println("The entered no. is not palindrome");
		
	}

}
