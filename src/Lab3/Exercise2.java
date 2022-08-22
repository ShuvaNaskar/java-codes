package Lab3;

import java.util.Arrays;

public class Exercise2 {
	static void sortString(String[] str) {
		Arrays.sort(str);
		int n = str.length;
		//System.out.println("String length is:" +n);
		if(n%2==0) {
			int n1=n/2;
			for(int i=0;i<n1;i++) {
				System.out.println(str[i].toUpperCase());
			   }
			for(int i=n1;i<n;i++) {
				System.out.println(str[i].toLowerCase());
				}
			}else if(n%2!=0) {
				int n1=(n/2)+1;
				for(int i=0;i<n1;i++) {
					System.out.println(str[i].toUpperCase());
				   }
				for(int i=n1;i<n;i++) {
					System.out.println(str[i].toLowerCase());
				}
			}
		
		
	}

	public static void main(String[] args) {
		String[] str = {"shuva","chandrani","pain","laxus","luffy","obito",
				"hinata","mirajane","gojo","gildart","shanks","madara"};
		sortString(str);

	}

}
