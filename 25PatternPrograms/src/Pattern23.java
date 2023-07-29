
public class Pattern23 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3&&j==2||i==4&&j==2||i==4 &&j==3) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}		
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==3&&j==2||i==4&&j==2||i==4 &&j==3) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}		
			}
			System.out.println();
		}
	}
}
