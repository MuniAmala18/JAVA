
public class Pattern9 {
	public static void main(String[] args) {
		char ch='G';
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print(ch+" ");
				ch--;
			}
			ch='G';
			System.out.println();
		}
	}
}
