package GroupProjects;

public class Task11DuplicateStringPrint {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings?
		
      String [] array= {"hey","blah", "meh", "wohoo","ughhh", "meh", "blah", "no", "yes","no","yeah"};
         for(int i=0; i<array.length; i++) {
        for(int m=i+1; m<array.length; m++)  {	 
         if(array[i].equals(array[m])) {   
        	  System.out.println(array[i]);
           }
        	 }      	  
           
	}

}
}