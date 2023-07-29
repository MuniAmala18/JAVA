import java.util.Scanner;

public class SumDigitsApp {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value to find the sum of digits");
		int n=scan.nextInt();
		DigitsSum dsum=new DigitsSum();
		System.out.println("The sum of digits in "+n+" is "+dsum.calculateSumOfDigits(n));
	}
}
