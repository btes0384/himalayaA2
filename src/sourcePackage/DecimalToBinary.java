package sourcePackage;

import java.util.Scanner;

public class DecimalToBinary {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scanner.nextInt();
		scanner.close();
		int index =0;
        int[] arr=new int[100];
        //TODO for octal use 8 instead of 2
        while (n>0){
            arr[index++]=n%2;
            n=n/2;
        }
        for (int i =index-1; i>=0 ; i--) {
            System.out.print(arr[i]);
        }
	}

}
