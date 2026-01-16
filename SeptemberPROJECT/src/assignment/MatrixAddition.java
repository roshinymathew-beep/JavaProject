package assignment;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int m1[][]=new int[3][3];
		int m2[][]=new int[3][3];		
		int m3[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("First Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m2[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Matrix after addition");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m3[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
