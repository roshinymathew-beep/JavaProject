package ControlStmts;

import java.util.Scanner;

public class ForeachEg {
	
	public static void main(String[] args) {
		int ar[][]=new int [2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("Entered values:");
		for(int a[]:ar)
		{
			for(int v:a)
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}


}
