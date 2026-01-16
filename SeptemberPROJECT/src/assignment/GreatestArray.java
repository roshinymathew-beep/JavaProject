package assignment;

import java.util.Scanner;

public class GreatestArray {

	public static void main(String[] args) {
		int a[]=new int[5],l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 no.s");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		l=a[0];
		for(int i=1;i<5;i++)
		{
			if(l<a[i])
				l=a[i];
		}
		System.out.println("Largest No. : "+l);

	}

}
