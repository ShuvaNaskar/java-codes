package Lab1;

import java.util.Scanner;

public class Exercise3 {
	static boolean checkNumber(int n) {
		boolean flag = true;
		int cd = n%10;
		n=n/10;
		while(n>0) {
			if(cd<=n%10) {
				flag = false;
				break;
			}
			cd = n%10;
			n=n/10;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("Increasing number");
		}else {
			System.out.println("Not a increasing number");
		}
		sc.close();

	}

}
