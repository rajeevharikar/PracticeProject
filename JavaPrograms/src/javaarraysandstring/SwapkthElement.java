package javaarraysandstring;

import java.util.Arrays;

public class SwapkthElement {
	
	    static void swapKth(int arr[], int n, int k) {
	       
	       int temp=0;
	       
	       temp=arr[k-1];
	       arr[k-1]=arr[arr.length-k];
	       arr[arr.length-k]=temp;
	       
	    }

	    public static void main(String[] args) {
			
//	    	int[] arr= {1,2,3,4,5,6,7,8};
	    	int[] arr= {5, 3, 6, 1, 2};
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.print(arr[i]);
	    		
	    	}
	    	System.out.println();
	    	SwapkthElement.swapKth(arr, 5, 2);
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.print(arr[i]);
	    	}
	    	
	    	
		}
	}
