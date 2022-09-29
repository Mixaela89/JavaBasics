package reviewClass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner=new Scanner(System.in);

	        System.out.println("Pelease Enter your age");
	        int age=scanner.nextInt();

	        System.out.println("Pelease Enter your name");
	        scanner.nextLine();
	        String name=scanner.nextLine();


	        System.out.println(name+" is "+age+" years old");

		
		
		
	}

}
