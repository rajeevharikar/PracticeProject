package javaarraysandstring;

public class FascinatingNumber {
	
	 float[] streamAvg(int[] arr, int n) {
	      
	      float sum=0;
	      
	      float[] finalArr= new float[n];
	      
	    for(int i=0;i<n;i++){
	        
	        sum=(sum+arr[i])/i+1;
	        finalArr[i]=sum;
	    }
	    
	    return finalArr;
	    }
}