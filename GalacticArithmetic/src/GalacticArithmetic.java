import java.util.Scanner;
public class GalacticArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		galacticArtithmetic(num1,num2);
		System.out.println(galacticArtithmetic(num1,num2));
	
	}
	public static long galacticArtithmetic(long num1,long num2) {
		return num1+num2;
	}

}
