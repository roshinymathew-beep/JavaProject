package oopConcept;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int a[]=new int[10];
		int odd[]=new int[10];
		int even[]=new int[10];
		int e=0,o=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				even[e]=a[i];
				e++;
			}
			else
			{
				odd[o]=a[i];
				o++;
			}
		}
		System.out.println("Even No.s are:");
		for(int i=0;i<e;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("Odd No.s are:");
		for(int i=0;i<o;i++)
		{
			System.out.println(odd[i]);
		}
		
	}

}
