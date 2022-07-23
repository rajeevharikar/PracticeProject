package javaarraysandstring;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int num[]= {1,2,3,5}; 
		findMissingnumber(num, 5);
		
	}
	
	
	public static void findMissingnumber(int num[], int totalCount) {
		
		int expsum= totalCount*((totalCount+1)/2);//n*(n+1)/2 for getting total count ie (1+2+3+4+5)

		int sum=0;
		
		for(int n:num) {
			
			sum= sum + n;
		}
		int mis=expsum-sum;
		System.out.println("missing number is: "+ mis );
	}

}
