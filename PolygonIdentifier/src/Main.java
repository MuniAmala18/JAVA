import java.util.Scanner;

public class Main
{
	public static void identifyPolygon(int sides)
	{
		if(sides>0) {
			if(sides==1) {
				System.out.println("Point");
			}
			else if(sides==2) {
				System.out.println("Line");
			}
			else if(sides==3) {
				System.out.println("Triangle");
			}
			else if(sides==4) {
				System.out.println("Quadrilateral");
			}
			else if(sides==5) {
				System.out.println("Pentagon");
			}
			else if(sides==6) {
				System.out.println("Hexagon");
			}
			else {
				System.out.println("Polygon");
			}
		}
		else {
			System.out.println("Your Maths skills were not Good!!");
		}
	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of sides to identify the shape");
		int sides=sc.nextInt();
		identifyPolygon(sides);
	}

}
