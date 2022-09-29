package com.syntax.class06;

public class SwitchCase {

	public static void main(String[] args) {
		// matching cases must be of same data type as the variable
		// it is a conditional statement in java to match the values not define true or fault
		// no duplicate case in switch is allowed 
		// switch case cant use logical, relational operations
		//cant use with boolean data type , float/double (cus they can be so long and unlimited options)

		char choice='Y';
		String answer;
		
		switch (choice) {
		case 'Y': 
			answer="yes"; 
			break;
			
		case 'N': 
		answer="No";
		break; 
		
		case 'M':
		answer="Maybe";
		break;
		
		default: // acts as else in if cond. 
			answer="Unknown";
		break; } // break is not nessesary in default but good practice
		
		System.out.println(answer);
	}

}
