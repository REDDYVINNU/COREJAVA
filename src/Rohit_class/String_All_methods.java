package Rohit_class;

public class String_All_methods {

	public static void main(String[] args) {
		// equals methods
		System.out.println("********equals methods**********");
		String s = "vinay";
		System.out.println(s.equals("vinay"));
		System.out.println(" ");
		//equal ignore case
		System.out.println("********equals ignore case methods**********");
		System.out.println(s.equalsIgnoreCase("VINAY"));
		System.out.println(" ");
		// method inside the string
		System.out.println("********method inside the String methods**********");
		System.out.println(s.charAt(3));
		System.out.println(" ");
		//contains methods
		System.out.println("********contains methods**********");
		System.out.println(s.contains("reddy"));
		//System.out.println(s.contains("vinay"));
		System.out.println(" ");
		// sub String
		System.out.println("********sub String methods**********");
		System.out.println(s.substring(1));
		System.out.println(" ");
		//to upper case
		System.out.println("********to upper case methods**********");
		System.out.println(s.toUpperCase());
		System.out.println(" ");
		//to lower case
		System.out.println("********to lower case methods**********");
		System.out.println(s.toLowerCase());
		System.out.println(" ");
		//trim method
		System.out.println("********trim methods**********");
		String y = "            reddy";
		System.out.println(y.trim());
		System.out.println(" ");
		//split method
		System.out.println("********split methods**********");
		String b = "Dharmala sai vinay";
		String[] p = b.split(" ");
		for(String x : p) {
		System.out.println(x);
		System.out.println(" ");
		// append method
		System.out.println("********append methods**********");
		StringBuffer s1 = new StringBuffer("dharmala");
		StringBuffer s2 = new StringBuffer("sai");
		s1.append(" sai vinay");
		s2.append(" vinay reddy");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
	}
