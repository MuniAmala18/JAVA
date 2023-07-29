import java.util.Scanner;

public class TemperatureConcverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double fahrenheit=sc.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));

		

	}

}
