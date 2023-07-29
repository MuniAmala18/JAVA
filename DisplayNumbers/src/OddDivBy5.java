public class OddDivBy5 {
	public void oddDivBy5(int n) {
		for(int i=2;i<=n;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.print(i+ " ");
			}
		}
	}
}
