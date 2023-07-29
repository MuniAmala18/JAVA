import java.util.Scanner;

public class DivisibilityApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value greater than 100");
		int n=sc.nextInt();
		if(n<100) {
			System.out.println("please enter more than 100");
			return;
		}
		else {
			System.out.println("DivisibilityApp Details!!\nEnter your wish to perform operations!!");
			System.out.println("1---divisible by 2");
			System.out.println("2---divisible by 3");
			System.out.println("3---divisible by 5");
			System.out.println("4---divisible by 2 and 5");
			System.out.println("5---divisible by 3 and 5");
			System.out.println("6---Even numbers divisible by 3");
			System.out.println("7---Odd numbers divisible by 5");
			int s= sc.nextInt();
			switch(s) {
				
				case 1:
					DivisibleBy2 d1=new DivisibleBy2();
					System.out.println("The Numbers divisible by 2 are:" );
					d1.diviBy2(n);
					break;
				case 2:
					System.out.println();
					DivisibleBy3 d2=new DivisibleBy3();
					System.out.println("The Numbers divisible by 3 are:" );
					d2.divBy3(n);
					break;
				case 3:System.out.println();
					DivisibleBy5 d3=new DivisibleBy5();
					System.out.println("The Numbers divisible by 5 are:" );
					d3.divBy5(n);
					break;
				case 4:System.out.println();
					DivisibleBy2and5 d4=new DivisibleBy2and5();
					System.out.println("The Numbers divisible by 2 and 5 are:" );
					d4.divBy2and5(n);
					break;
				case 5:
					System.out.println();
					DivBy3and5 d5=new DivBy3and5();
					System.out.println("The Numbers divisible by 3 and 5 are:" );
					d5.divBy3and5(n);
					break;
				case 6:
					System.out.println();
					EvenDivBy3 d6=new EvenDivBy3();
					System.out.println("The Even Numbers divisible by 3 are:" );
					d6.evenDivBy3(n);
					break;
				case 7:
					System.out.println();
					OddDivBy5 d7=new OddDivBy5();
					System.out.println("The Odd Numbers divisible by 5 are:" );
					d7.oddDivBy5(n);
					break;
				default:
					System.out.println("Invalid Input!!Please see the message properly!!!");
				}
			}
		sc.close();
		
		
	}
}
