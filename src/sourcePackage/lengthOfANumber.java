package sourcePackage;

import java.util.Scanner;

public class lengthOfANumber {
	 private static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]) {
		
		//1. Length of a number 
		System.out.println("Enter the number");
		int n= scanner.nextInt();
	    
	    int a=0;
		if(n<0) {
		 n=n*-1;
		}else if(n==0) {
	     System.out.println("1");
		}else {
			while(n>0){n=n/10;
				       a++;}
		}
		System.out.println("the length of a number is "+a);
	}

}
