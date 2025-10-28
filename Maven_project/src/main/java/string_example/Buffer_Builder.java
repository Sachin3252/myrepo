package string_example;

public class Buffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("Hello");
		System.out.println(a);
		StringBuilder s = new StringBuilder("Hello Planet");
	    System.out.println(s);
	    //insert: to add a new string based on the index position
	    System.out.println(s.insert(12," World "));
	    System.out.println(s);
	    //append add the new string at last
	    System.out.println(a.append(" World "));
	    //replace : to replace the new string based on index position
	    System.out.println(s);
	    System.out.println(s.replace(5, 12, " Earth "));
	    //reverse : used to reverse a string 
	    System.out.println(s.reverse());
	    //delete : to delete a string based on index position
	    System.out.println(s.delete(2, 8));
	    System.out.println(a.delete(2, 4));
	    
	    

	}
}