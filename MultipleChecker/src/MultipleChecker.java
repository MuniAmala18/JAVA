import java.util.Scanner;
public class MultipleChecker {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter m and n:");
		int m=scan.nextInt();
		int n=scan.nextInt();
		checkMultipleOfTen(m,n);
		
	}
	public static void checkMultipleOfTen(int m,int n) { 
		
		if(m%n==0) {
			System.out.println("Entered Number "+m+" is multiple of "+n);
		}
		else {
			System.out.println("Entered Number "+m+" is not multiple of "+n);
		}
	}

}
