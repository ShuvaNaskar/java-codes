package Lab1;

import java.util.Scanner;

public class Exercise2 {
    static int calculateDifference(int n) {
    	int sum = 0;
    	int sqsum = 0;
    	for(int i=0;i<=n;i++) {
    		sqsum += (i*i);
    		sum +=i;
    	}
    	System.out.println("Total sum of squares = " +sqsum);
    	System.out.println("Total sum = " +sum);
    	int diff = (sqsum-sum);
    	System.out.println("The difference = " +diff);
    	return diff;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		calculateDifference(n);
	    sc.close();	
	}
        
        
}
