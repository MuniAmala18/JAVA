
public class Pattern12 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i+j==4) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print(" ");
				}
				ch++;
				
			}
			System.out.println();
		}
	}
}
