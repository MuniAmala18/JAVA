import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.printf("%.2f\n",journeyCalculator.calculateDistance(speed,time));

		
	}

}
