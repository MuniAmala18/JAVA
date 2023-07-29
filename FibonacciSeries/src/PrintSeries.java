import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n to print the fibonacci series:");
		int n=sc.nextInt();
		Series series=new Series();
		series.Fibo(n);

	}

}
