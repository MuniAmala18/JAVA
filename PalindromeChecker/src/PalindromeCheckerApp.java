import java.util.Scanner;

public class PalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value to reverse");
		int n=scan.nextInt();
		ReverseNum pali=new ReverseNum();
		int rev=pali.calculateReverse(n);
		System.out.println("The reverse of "+n+" is "+rev);
		if(n==rev) {
			System.out.println("Entered Number "+n+" is palindrome");
		}
		else {
			System.out.println("Entered Number "+n+" is not palindrome");
		}
	}

}
