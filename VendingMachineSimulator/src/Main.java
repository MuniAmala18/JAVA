import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
		if(productCode.equalsIgnoreCase("P01")){
			System.out.println("Coca Cola");
		}
		else if(productCode.equalsIgnoreCase("P02")) {
			System.out.println("Pepsi");
		}
		else if(productCode.equalsIgnoreCase("P03")) {
			System.out.println("Frooty");
		}
		else if(productCode.equalsIgnoreCase("P04")) {
			System.out.println("Thumbs Up");
		}
		else if(productCode.equalsIgnoreCase("P05")) {
			System.out.println("Maaza");
		}
		else {
			System.out.println("Enter valid code!!!");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the productcode for getting softdrinks from P01-P05");
		String productCode=sc.next();
		getProduct(productCode);

	}
}
