package sourcePackage;

import java.util.Scanner;

public class FactorialOfANumber {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n= scanner.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial is :"+factorial);
	}
}
