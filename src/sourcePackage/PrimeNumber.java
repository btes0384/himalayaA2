package sourcePackage;
import java.util.Scanner;
public class PrimeNumber {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]) {
		int n= scanner.nextInt();
		boolean isprime=true;
		 for (int j = 2; j <=n/2 ;j++) {
	            if(n%j==0) {
	                //System.out.println(n+ " number is a Prime number");
	                isprime=false;
	                break;
	            }
	            else
	            {
	                //System.out.println( n+" number is not a prime number");
	            	
	              
	            }
	            if(isprime) {
	            	System.out.println(n+" is not prime number");
	            }
	            else {
	            	System.out.println(n+" is a prime number");
	            }
	        }
    //TODO prime number 1 to 100
		 int number=100;
		 for(int i=0;i<number;i++) {
			 boolean isPrime=true;
			 for(int k=0;k<number;k++) {
				 if(i%k==0) {
					 isPrime=false;
					 break;
				 }
			 }
			 if(isPrime) {
				 System.out.println(i+" ");
			 }
		 }
   }
}