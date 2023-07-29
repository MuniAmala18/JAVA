import java.util.Scanner;

public class Main
{
	
	public static void identifyCharacter(char ch)
	{
	
		if(Character.isDigit(ch)) {
			System.out.println("Enter Character "+ch+" is digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Enter Character "+ch+" is Special character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered Character "+ch+" is lower case Vowel");
				}
				else {
					System.out.println("Entered Character "+ch+" is Upper Case Vowel");
				}
				break;
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered Character "+ch+" is lower case Consonant");
				}
				else {
					System.out.println("Entered Character "+ch+" is Upper Case Consonant");
				}
			}
			
		}
	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to check for vowel or consonant:");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
		
	}
	
}
