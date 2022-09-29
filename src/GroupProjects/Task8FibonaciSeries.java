package GroupProjects;

import java.util.Scanner;

public class Task8FibonaciSeries {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
         
		//0 1 /1 2 3 5 8 13 21  
		//1 2 3 5
		//int n, first = 0,next = 1;
        
      //  System.out.println("Enter how may fibonnaci numbers to print");
     //   Scanner scanner = new Scanner(System.in);
     //   n = scanner.nextInt();
     //   System.out.print("The first " + n + " Fibonacci numbers are: ");
     //   System.out.print(first + " " + next);
     //   for (int i = 1; i<=n-2; ++i)
    //    {
     //       int sum = first + next;
     //       first = next;
     //       next = sum;
     //       System.out.print(" " + sum);
        
		 
		 
	 // Write a Java Program to print the first 10 numbers of Fibonacci series
    // 0 1 1 2 3 5 8 13 21
	
    int previous=0;
    int currentNumber=1;
    int nextNum=0;
    System.out.println(previous);
    System.out.println(currentNumber);
    for(int i=0; i<8;i++) {
        nextNum=previous+currentNumber;
        System.out.println(nextNum);
        previous=currentNumber;
        currentNumber=nextNum;

 	 
	
		
    }}}       
	


