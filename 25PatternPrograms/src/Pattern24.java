
public class Pattern24 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				if(i==1&&j==0||i==2&&j==1||i==3&&j==2||i==4&&j==3||i==2&&j==6||i==3&&j==5||i==1&&j==7) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
