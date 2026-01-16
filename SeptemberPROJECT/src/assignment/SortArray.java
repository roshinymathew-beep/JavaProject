package assignment;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int ar[]=new int[10],t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(ar[i]>ar[j])
				{
					t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
