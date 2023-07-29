import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	}

}
