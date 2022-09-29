package com.syntax.class4;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your city ");
		String city=scanner.nextLine();

		System.out.println("please enter your temperature");
		int temperature=scanner.nextInt();
		double convertedTemp=(int)(temperature-32)*5/9; 
		
		System.out.println("The temperature in"+city+ "is"+convertedTemp);
		
		
		
	}

}
