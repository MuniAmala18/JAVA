import java.util.Scanner;

public class ReverseNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value to reverse");
		int n=scan.nextInt();
		ReverseNum rev=new ReverseNum();
		System.out.println("The reverse of "+n+" is "+rev.calculateReverse(n));

	}

}
