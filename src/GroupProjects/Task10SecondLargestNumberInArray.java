package GroupProjects;

public class Task10SecondLargestNumberInArray {

	public static void main(String[] args) {
		// Write a java program to find the second largest num in array
		
		int [] num= {1, 19, 300, 300,80,285,299};
		
		int secondLargest=num[0];
		int largestnum=num[0];
		
		for(int n:num) {
			if(n>largestnum ) {
				largestnum=n; 
			}}
			for(int m:num) {
				if(m<largestnum&&m>secondLargest) {
					secondLargest=m;
				}
			}
			
		
		
		System.out.println(secondLargest);
		
		 int[] numbers= {12,18,54,38,29,41};

	        int lar=numbers[0];
	        int SecLar=numbers[0];

	        for(int i=1;i<numbers.length;i++) {
	            if(lar<numbers[i]) {
	                lar=numbers[i];
	            }
	        }

	        for(int a=1;a<numbers.length;a++) {
	            if(SecLar<numbers[a]&&numbers[a]!=lar) {
	                SecLar=numbers[a];
	            }
	        }
	        System.out.println("The second largest number is "+SecLar);

	}

}
