package assignment;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		n=sc.nextInt();
		if(n<2)
		 f=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}

		if(f==0)
			System.out.println("The entered number is prime");
		else
			System.out.println("The entered number is not prime");
		
	}

}
