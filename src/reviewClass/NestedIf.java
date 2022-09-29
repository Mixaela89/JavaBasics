package reviewClass;

public class NestedIf {

	public static void main(String[] args) {
		
		
    /* 
     *  nested if conditions are conditions which are dependent on each other 
     */
		// if outer condition is not true inner cond is never checked 
      
		boolean studyHard=true;
		
		if(studyHard) {
			System.out.println("We get the job in first few weeks"); 
			boolean goodCoomunicationSkills=true;
			
			if(goodCoomunicationSkills) {
				System.out.println("might get job in apple amazon etc");
			}
			
			else {
				System.out.println("we need to work on our communication skills");
			}
		}
      
		
		
		else {System.out.println("We get the job in first few weeks"); }
	}

}
