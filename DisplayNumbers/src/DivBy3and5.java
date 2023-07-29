
public class DivBy3and5 {
	public void divBy3and5(int n) {
		for(int i=3;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+ " ");
			}
		}
	}
}
