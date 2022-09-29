package replits;

import java.util.Scanner;

public class Replit77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in); 
		
		int [] arr = new int [5]; 
		
		for (int i=0; i<5; i++) {
			arr[i]=scan.nextInt(); 
		}
			
		for (int j=4; j>=0; j--) {
			System.out.println(arr[j]);
		}
          
		
		
	}

}
