import java.util.Scanner;

public class DiscountCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the purcahse Amount:");
		double purchaseAmount=sc.nextDouble();
		checkDiscount(purchaseAmount);

	}
	public static void checkDiscount(double purchaseAmount)
	{ 
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount not Applicable");
		}
		
	}

}
