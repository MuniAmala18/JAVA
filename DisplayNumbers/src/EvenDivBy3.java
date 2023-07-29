
public class EvenDivBy3 {
	public void evenDivBy3(int n) {
		for(int i=2;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i+ " ");
			}
		}
	}
}
