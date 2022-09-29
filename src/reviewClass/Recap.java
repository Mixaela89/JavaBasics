package reviewClass;

public class Recap {

	public static void main(String[] args) {
		// explicit/narrowing/manual casting 
// as we cant fit 129 in byte we will get wrong results 9 byte can take up to 127
		short largerBox=129; 
		byte smallerBox=(byte)largerBox; 
		System.out.println(smallerBox); 
		
		// explicit/narrowing/manual casting
		//as we can fit 129 in short we will get proper result 
		int largerBox1=129; 
		short smallerBox1=(short)largerBox1; 
		System.out.println(largerBox1); 
		
		
		//implicit/widening/auto
		short smallerBox2=45;
		long largerBox2=smallerBox2;
		System.out.println(largerBox2);
		
		
	}

}
