package sourcePackage;
import java.util.Scanner;
public class TrioSeries {
   private static Scanner scanner = new Scanner(System.in);	
   public static void main(String args[]) {
	   System.out.println("enter the first Number");
	   int n1= scanner.nextInt();
	   System.out.println("enter the Second Number");
	   int n2= scanner.nextInt();
	   System.out.println("enter the Third Number");
	   int n3= scanner.nextInt();
	   int sum=0,count=10;
	   for(int i=0;i<count;i++) {
		   sum=n1+n2+n3;
		   System.out.println(""+sum);
		   n1=n2;
		   n2=n3;
		   n3=sum;
	   }
   }
}
