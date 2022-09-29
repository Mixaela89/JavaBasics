package replits;

import java.util.Scanner;

public class Repl37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner (System.in);
          System.out.println("are u thirsty");
          System.out.println("are u sleepy");
          
          boolean thirsty=scan.nextBoolean();
          boolean sleepy=scan.nextBoolean();
          
          String output=null;
          if (thirsty&&!sleepy) {
        	  output="water";
          } else if (thirsty&&sleepy) {
        	  output="coffee";
        	  
          }else if(!thirsty&&sleepy) {
        	  output="tea";
          }
          
		System.out.println(output);
          
          
          
	}

}
