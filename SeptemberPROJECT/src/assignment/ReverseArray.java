package assignment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	int ar[]=new int[10],temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 elements");
	for(int i=0;i<10;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<ar.length/2;i++)
	{
		temp=ar[i];
		ar[i]=ar[ar.length-1-i];
		ar[ar.length-1-i]=temp;
	}
	System.out.println("Reversed Array");
	for(int i=0;i<10;i++)
		System.out.print(ar[i]+" ");
	}

}
