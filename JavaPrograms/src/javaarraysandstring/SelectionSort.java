package javaarraysandstring;

import java.util.Arrays;

public class SelectionSort {

	
     public static void main(String[] args) {
		
    	 int[] arr= {12,3,7,9,1};
    	 
    	 for(int i=0; i<arr.length-1;i++) {
    		 
    		 int minIndexAssumed=i;
    		 
    		 for(int j=i+1;j<arr.length;j++) {
    			 
    			 if(arr[j]< arr[minIndexAssumed]) {
    				 minIndexAssumed=j;
    			 }
    			 int temp=arr[i];
    			 arr[i]=arr[minIndexAssumed];
    			 arr[minIndexAssumed]=temp;
    		 }
    	 }
    	 
    	 System.out.println(Arrays.toString(arr));
    	 
	}
}
