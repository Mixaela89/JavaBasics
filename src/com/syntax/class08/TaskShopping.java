package com.syntax.class08;

import java.util.Scanner;

public class TaskShopping {

	public static void main(String[] args) {
		// shopping task 
		/* Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever user done with payments program should say "Thank you for shopping!"	
		 */
		
		Scanner scan=new Scanner(System.in); 
		 System.out.println("pls enter item u want to buy");
		 String item=scan.nextLine();
		 System.out.println("pls enter price of the item");
		 int price=scan.nextInt(); 
		 int paid=0;
		 int change=0; 
		 int needMore=0;
		 do {System.out.println("pls pay ");
			 paid=scan.nextInt(); 
			 if(paid>price) {
				 change=paid-price; System.out.println("your change is "+ change);
				 continue;
			 }
			 else if (paid<price) {
				 needMore= price-paid; System.out.println("you need to pay additional " + needMore );
				 continue;
			 }
			 
		 }while (price!=paid); 
		 
		System.out.println("thank u for shopping");

		//enhanced version 
		Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String itemm = input.nextLine();

        System.out.println("What is the price of the item?");
        double pricee = input.nextDouble();

        double money;
        double total = 0;
        System.out.println("Please pay for your " + itemm);

        do {

            money = input.nextDouble();

            total += money; // accumulate all money
            double need;
            double changee;

            if (total < pricee) {
                need = pricee - total;
                System.out.println("You need to pay more $" + need);
            } else if (total > pricee) {
                changee = total - pricee;
                System.out.println("Here is your change " + changee);
                break;
            }

        } while (total != pricee);

        System.out.println("Thank you for shopping");
    


		
		
		
		
	}

}
