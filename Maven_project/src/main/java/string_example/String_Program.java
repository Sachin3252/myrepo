package string_example;

public class String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " hello india";
		System.out.println(s);
		String s1 = new String (" HI AUSIES");
		System.out.println(s1);
		//length
		System.out.println(s.length());
		//Concat used to add two strings
		System.out.println(s1.concat(s));
		System.out.println(s);
		//charAt used to return the character based on index position
		System.out.println(s.charAt(10));
		//contains()to check whether a char or word present in string 
		System.out.println(s1.contains("HI"));
		System.out.println(s.contains(s1));
		String j = "java";
		String a = "java";
		String b = "JAVA";
		String m = "selinium";
		String d = "";
		int i = 32;
		//equals to check whether two strings are equal or not
		System.out.println(j.equals(a));
		System.out.println(a.equals(b));
		System.out.println(b.equals(m));
		//equalIgnorCase to compare two strings and ignore the case
		System.out.println(b.equalsIgnoreCase(m));
		System.out.println(j.equalsIgnoreCase(a));
		//toUpperCase convert small letters to capital letters
		System.out.println(m.toUpperCase());
		//toLowerCase to convert capital letters to small letters
		System.out.println(b.toLowerCase());
		//isEmpty to check whether a string is empty or not
		System.out.println(b.isEmpty());
		System.out.println(d.isEmpty());
		//valueOf convert any data type to string
		System.out.println(String.valueOf(i));
		String w = "MANUAL";
		String x = "MANUAL";
		String y = new String ("MANUAL");
		System.out.println(w.equals(x));
		System.out.println(w==x);
		
		
		
				
				
	    

	}
}