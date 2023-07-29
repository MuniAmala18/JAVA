
public class Pattern16 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=5;i>=1;i--) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
}
