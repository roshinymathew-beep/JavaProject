package StringFuns;
import java.util.Scanner;
public class Qn2 {

	public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
		if(s.contains("language"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		sc.close();
	}

}
