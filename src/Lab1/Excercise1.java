package Lab1;
import java.util.Scanner;

public class Excercise1 {
	
	static int calculateSum(int n) {
		int sum =0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Total Sum = " +sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		calculateSum(n);
		sc.close();
	}

}
