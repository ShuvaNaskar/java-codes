package Lab3;

public class Exercise4 {
	static void countArray(String str) {
		int n = str.length();
		int[] count = new int[500];
		
		char[] ch = new char[n];
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
			
		}
		for(int i=0;i<n;i++) {
			ch[i]=str.charAt(i);
			int find = 0;
			for(int j=0;j<n;j++) {
				if(ch[j]==str.charAt(i)) {
				find++;
				
				}
				
			}
			if(find==1) {
			  System.out.println("Number of " +str.charAt(i)+ " is " +count[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ghhtterghjillkhhfderuqtetdvdhfollstrvdltgrffsrkllhgffdsxcv";
		countArray(str);

	}

}
