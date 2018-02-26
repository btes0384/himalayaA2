package sourcePackage;

import java.util.Scanner;

public class ArmstrongNumber {
	public static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]) {
		int n=scanner.nextInt();
		scanner.close();
		int c=0,a,temp;
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
