package Lab3;

import java.util.Arrays;

public class Exercise1 {
	static int[] getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Second smallest value: " +arr[1]);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {5,47,98,74,21,1,36,59,23};
		getSecondSmallest(arr);

	}

}
