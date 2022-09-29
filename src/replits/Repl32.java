package replits;

import java.util.Scanner;

public class Repl32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your gender: M or F");
		
		System.out.println("Please enter your age");
		String gender=scan.nextLine();
		int age=scan.nextInt(); 
		
		if (age>25) {
			if (gender.equals("F")) {
				System.out.println("woman");
			}else {System.out.println("man");}
			
		
		}else if (age<25) {if (gender.equalsIgnoreCase("F")) { System.out.println("girl");
		}else {System.out.println("boy");}
		

	}

}}
