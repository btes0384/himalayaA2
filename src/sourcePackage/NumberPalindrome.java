package sourcePackage;

import java.util.Scanner;

public class NumberPalindrome {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter teh number to check the palindrome");
		int n=scanner.nextInt();
		int temp=n;
		int sum=0;
    	while(n>0) {
    		int r=n%10;
    		sum=r+(sum*10);
    		n=n/10;
    	}
    	if(temp==sum) {
    		System.out.println("number is palindrome");
    	}
    	else{
    		System.out.println("the number is not palindrome");
    	}
	}

}
