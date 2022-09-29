package replits;

import java.util.Scanner;

public class Replit28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in); 
		
		System.out.println("pls enter width and height");
		double width=scan.nextDouble();
		double height=scan.nextDouble();
		if (width==height) {
			System.out.println("square");
		}else 			System.out.println("rectangle");
		
	}

}
