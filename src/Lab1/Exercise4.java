package Lab1;

import java.util.Scanner;

public class Exercise4 {
	static boolean checkNumber(int y, int x) {
		boolean flag1 = true;
		boolean flag2 = false;
		double d = (Math.log(y)/Math.log(x));
		if(d%1==0) {
			System.out.println(flag1);
		}else {
			System.out.println(flag2);
		}
		return flag1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 2;
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		checkNumber(y,x);
		sc.close();
	}

}
