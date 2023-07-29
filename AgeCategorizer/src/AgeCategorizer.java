import java.util.Scanner;

public class AgeCategorizer
{	
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12) {
			System.out.println("You are a Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("You are a Teen");
		}
		else if(age>=20 && age<=59) {
			System.out.println("You are an Adult");
		}
		else {
			System.out.println("You are a Senior");
		}
	
	}
	
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your age for categorize:");
	  int age=sc.nextInt();
	  categorizeAge(age);
	}

}
