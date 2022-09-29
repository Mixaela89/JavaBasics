package com.syntax.class4;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scanner.nextInt();
		if (age>=18) {System.out.println("You are getting a DL");}
		else {System.out.println("You are getting a permit");}
	}

}
