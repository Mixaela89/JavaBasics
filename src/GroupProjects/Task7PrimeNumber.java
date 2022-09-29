package GroupProjects;

public class Task7PrimeNumber {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		// divisable only by itself and 1
		
       int num=9;
		boolean isPrime=true;
		if (num>1) {
			
			for (int i=2;i<num;i++) {
				if (num%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		
		if (isPrime) {
			System.out.println(num+ "is prime");
		}
		else {System.out.println(num+"is not prime");}
	}

}
