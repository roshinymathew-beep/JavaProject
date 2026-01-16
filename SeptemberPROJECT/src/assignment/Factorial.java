package assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. :");
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial is:"+f);
		
	}

}
