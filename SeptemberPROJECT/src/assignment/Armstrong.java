package assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,s=0,r,t,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		n=t;
		while(n>0)
		{
			r=n%10;
			s+=Math.pow(r, count);
			n=n/10;
		}
		if(s==t)
		{
			System.out.println("Armstrong Number ");
		}
		else
			System.out.println("The entered no. is not armstrong");

	}

}
