import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers to find GCD");
		int m=sc.nextInt();
		int n=sc.nextInt();
		//FindTheGcd gcd=new FindTheGcd();
		System.out.println("The GCD of "+m+" and "+n+" is "+FindTheGcd.FindGcd(m, n));
		
	}

}
