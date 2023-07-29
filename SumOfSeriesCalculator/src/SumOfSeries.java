import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value to find the sum of series!!!");
		int n=scan.nextInt();
		calculateSumOfSeries(n);

	}
	public static void calculateSumOfSeries(int n){
		double s=0;
		for(int i=1;i<=n;i++) {
			s=s+(1.0/i);
		}
		System.out.println(s);

	}

}
