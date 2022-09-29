package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// ask user where they are from. based on the country we need to define fav food

		Scanner in=new Scanner(System.in);
		System.out.println("pls tell me where are you from?");
		String country=in.nextLine(); 
		String favoriteFood;
		
		switch(country) {
		case "USA": 
			favoriteFood="burgers and fries";
			break;
			
		case "Kazakhstan":
			favoriteFood="beshparmark";
			break;
		
		case "Turkey": 
			favoriteFood="Adana kebab";
			break;
			
		case "India": 
			favoriteFood="curry";
			break;
			
			default:
				favoriteFood="unkown";
				break;
		}
		
		System.out.println("you are from "+ country+ " and your favorite food is "+ favoriteFood);
	}

}
