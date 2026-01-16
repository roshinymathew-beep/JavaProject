package StringFuns;

public class Qn3 {

	public static void main(String[] args) {
		String s="selenium webdriver is used for webapplication testing";
		String s1[]=s.split(" ");
		for(String i:s1)
		{
			if(i.equals("webapplication"))
				break;
			else
				System.out.println(i);
		
		}
		
		
		
	}

}
