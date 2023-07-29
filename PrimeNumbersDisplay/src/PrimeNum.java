import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the range:");
		int n=sc.nextInt();
		int count=0;
		if (n < 2) {
            System.out.println("There are no prime numbers in the range.");
		}
		else {
			for(int i=2;i<=n;i++) {
				int res=checkPrime(i);
				if(res!=0) {
					System.out.println(res);
					count++;
				}
			}
			System.out.println("The Count of prime numbers until "+n+" is "+count);
		}
		
	}
	public static int checkPrime(int n) {
		if(n==2) {
			return n;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}

}
