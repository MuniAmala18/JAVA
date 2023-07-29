import java.util.Scanner;

public class SemesterMarksAverager {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res1=sc.nextInt();
		int res2=sc.nextInt();
		int res3=sc.nextInt();
		int res4=sc.nextInt();
		int res5=sc.nextInt();
		int res6=sc.nextInt();
		int res7=sc.nextInt();
		int res8=sc.nextInt();
		
		System.out.printf("%.2f",calculateAverage(res1,res2,res3,res4,res5,res6,res7,res8));
	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;
	}

}
