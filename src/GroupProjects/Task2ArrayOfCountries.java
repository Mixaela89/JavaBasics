package GroupProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Task2ArrayOfCountries {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is created, retrieve all values from 
		//it and while retrieving those values print capital for each country.(use 2 different loops).
		
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("pls enter how many countries u want to store");
               int size =scanner.nextInt(); 
               String [] countries =new String[size];
               String[] capitals=new String[size]; 
               scanner.nextLine(); // to absorb the space the enter from scanner 
               for (int i=0; i<size; i++) {
            	   System.out.println("pls enter the country name");
            	   countries[i]= scanner.nextLine();
            	   System.out.println("pls enter the country name");
            	   capitals[i]= scanner.nextLine();
               }
               
                System.out.println(Arrays.toString(countries));
                System.out.println(Arrays.toString(capitals));
	}

}
