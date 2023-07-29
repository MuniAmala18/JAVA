
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0&&j<=4||j==2&&i<=3||i==4&&j==1||i==3&&j==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			for(int j=0;j<5;j++) {
				if(i==0&&j==2||i==1&&j==1||i==1&&j==3||i==2&&(j>=1&&j<=3)||i==3&&j==1||i==4&&j==1||i==3&&j==3||i==4&&j==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("");
			for(int j=0;j<8;j++) {
				if(i==1&&j==0||i==2&&j==1||i==3&&j==2||i==4&&j==3||i==2&&j==6||i==3&&j==5||i==1&&j==7) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			for(int j=0;j<5;j++) {
				if(i==0&&j==2||i==1&&j==1||i==1&&j==3||i==2&&(j>=1&&j<=3)||i==3&&j==1||i==4&&j==1||i==3&&j==3||i==4&&j==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
