package Lab4;

import java.util.Scanner;

public class Exercise1 {
	static int calSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=(i*i*i);
		}
		System.out.println("Total sum = " +sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n =sc.nextInt();
		calSum(n);
		sc.close();

	}

}
