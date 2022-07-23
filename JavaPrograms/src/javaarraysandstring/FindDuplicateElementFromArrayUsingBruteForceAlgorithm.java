package javaarraysandstring;

public class FindDuplicateElementFromArrayUsingBruteForceAlgorithm {

	
	public static void main(String[] args) {
		
		int[] arr= {1,5,3,6,7,8,7,6};
			
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate elements are :"+arr[i]);
				}
			}
		}
	}
}
