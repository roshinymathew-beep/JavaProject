package oopConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream f=new FileInputStream("E://Data.xlsx");
		System.out.println("Started");
		Thread.sleep(5000);
		System.out.println("stopped");
	}

}
