package javaarraysandstring;

public class sumofnnumbers {
	
	long seriesSum(int n) {       
//	       long sum=0;
//	       for(int i=0;i<=n;i++){
//	           sum= sum+i;
//	       }
//	       return sum;
		
		 long sum= (long) n * (long)(n+1)/2;
		 
		 return sum;
	       }
	
	public static void main(String[] args) {
		
		sumofnnumbers sm= new sumofnnumbers();
		System.out.println(sm.seriesSum(6));
		
	}

}

