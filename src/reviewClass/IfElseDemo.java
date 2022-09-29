package reviewClass;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName="Admin";
		String password="password123";
		if(password.equals("password123")) //using equals. because it is non primitive, for primitive ==
		
          {
        	 System.out.println("welcome "+userName);
        	 }
        	  
        	 else {System.out.println("wrong password "+userName); }
		
		/* if we need one outcome based on if cond. we use if. 
		 * if the outcomes are two we use if else 
		 * if outcomes are more than that we can use if else if .else 
		 */
		
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
  // _________________________________________________________________________________
        // same output but this version is recommended to use if else if else 
        // whenever you have to check more than two conditions always use if else if conditions 
        
        
        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
		
	}

}
