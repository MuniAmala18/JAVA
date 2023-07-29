
public class Checker {
	public int calculateArmstrong(int n,int count) {
		int arm=0;
		while(n!=0) {
			int rem=n%10;
			arm=(int)(arm+Math.pow(rem, count));
			n=n/10;
		}
		return arm;
	}
}
