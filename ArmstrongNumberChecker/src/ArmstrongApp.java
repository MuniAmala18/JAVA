import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value to check for Armstrong number");
		int n=scan.nextInt();
		int count=0;
		int original=n;
		while(n!=0) {
			n=n/10;
			count++;
		}
		Checker arm= new Checker();
		int rev=arm.calculateArmstrong(original,count);
		if(original==rev) {
			System.out.println("Entered number "+original+" is Armstrong Number");
		}
		else {
			System.out.println("Entered number "+original+" is  not Armstrong Number");
		}
	}

}
