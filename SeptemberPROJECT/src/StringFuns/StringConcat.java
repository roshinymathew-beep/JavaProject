package StringFuns;

public class StringConcat {
	
	public static void main(String[] args) {
		String s="Hello";
		String s1="Luminar";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(s+1+4);
		System.out.println(1+4+s);
		
		
		String h ="Welcome";
		System.out.println(h.length());
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		System.out.println(h.startsWith("e"));
		System.out.println(h.endsWith("E"));
		
		//to compare strings
		
	   String w="Abc";
	   String z="abc";
	   System.out.println(w.equals(z));
	   System.out.println(w.equalsIgnoreCase(z));
	
	//to remove Whitespace
	 String e="    Luminar";
	 System.out.println(e.trim());

	 
	 String o="Welcome to Luminar";
	 System.out.println(o.contains("luminar"));
	 
	 System.out.println(o.replace("co","ex"));
	 System.out.println(o.replace("co","exm"));
	 System.out.println(o.replace("com","ex"));
	 
	 String a="welcome";
	 System.out.println(a.substring(3));
	 System.out.println(a.substring(0,4));
	 
	 System.out.println(a.charAt(2));
	 String q="Welcome to Luminar";
	 String a1[]=q.split(" ");
	 for(String b:a1)
		 System.out.println(b);
	 String k="hello";
	 char c[]=k.toCharArray();
	 for(char m:c)
		 System.out.println(m);
		
	}

}
