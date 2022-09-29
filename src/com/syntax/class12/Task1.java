package com.syntax.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// store username and pass, use scanner or create var
		//pass should have at least min 8 char. cant be empty 
            // pass can not contain username and pass has to match confirm pass
		
		
		String userName; 
		 String password; 
		
		String confirmPassword; 
		
		Scanner scanner=new Scanner(System.in); 
		System.out.println("pls enter the username");
		userName=scanner.next();
		System.out.println("pls enter the password");
		password=scanner.next(); 
		System.out.println("pls enter the password again");
		confirmPassword=scanner.next(); 
		
		
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("username and pass can not be empty");
		}  else if(password.length()<8) {
			System.out.println("password is too short");
		} else if (password.contains(userName)) {
			System.out.println("password cant contain username");
		} else if(!password.equals(confirmPassword)) {
			System.out.println("passwords do not match");
		}else{System.out.println("username and pass have been created");}
		
		
		
	}

}
