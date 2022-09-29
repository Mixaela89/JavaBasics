package replits;

import java.util.Scanner;

public class Repl22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("enter your name");
		System.out.println("enter your number");
		System.out.println("enter your age");
		String name=scan.nextLine();
	
		String number=scan.nextLine();
		int age=scan.nextInt();
		System.out.println(name+number+age);
		
	}

}
