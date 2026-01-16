package mypackage;

import java.util.Scanner;

public class ScannerEg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fullname");
		String f_name=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		System.out.println(f_name+age+name);
		System.out.println(c);
		}

}
