package inheritence;

public class Child_Inheritence extends Single_Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Inheritence obj = new Child_Inheritence ();
		obj.sum(32, 12);
		obj.display();
		Single_Parent obj1 = new Single_Parent ();
		obj1.display();
		//obj1.sum(6,5); we cannot access child class property by creating the parents class object
		
		
	}
 
	 public void sum (int a, int b)
	
	 {
		 int c = a+b;
		 System.out.println("The sum is " +c);
	 }
	

}
