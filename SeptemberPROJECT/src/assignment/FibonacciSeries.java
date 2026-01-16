package assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,l,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit:");
		l=sc.nextInt();
		
			while(s<=l)
			{	
				System.out.println(s);
				a=b;
				b=s;
				s=a+b;
			
			}
	
		
	}

}
