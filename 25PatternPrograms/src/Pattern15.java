
public class Pattern15 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
		for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            int s=1;
            for (int k = i; k >= 1; k--) {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
	}

}
