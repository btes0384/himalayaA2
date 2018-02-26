package sourcePackage;

import java.util.Scanner;

public class ReverseOfANumber {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scanner.nextInt();
		int sum=0;
    	while(n>0) {
    		int r=n%10;
    		sum=r+(sum*10);
    		n=n/10;
    	}
    	System.out.println(" The reverse of given number is "+sum);
	
	}	
}
