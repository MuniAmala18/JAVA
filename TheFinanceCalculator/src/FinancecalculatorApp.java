import java.util.Scanner;
public class FinancecalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double time=sc.nextDouble();
		double rate=sc.nextDouble();
		FinanceCalculator finance=new FinanceCalculator();
		System.out.printf("%.2f",finance.calculateSimpleInterest(principal, rate, time));

	}

}
