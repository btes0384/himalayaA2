package sourcePackage;

public class FibbonaciSeries {
	public static void main(String[] args) {
		
		int m=0,n=1,sum,i,count=10;
		System.out.print(m+" "+n);
		for( i=2;i<count;i++) {
			sum=m+n;
			System.out.print(" "+sum);
		   m=n;
		   n=sum;
		}
	}
}
