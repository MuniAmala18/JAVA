import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+ " is "+ fact);

	}

}
