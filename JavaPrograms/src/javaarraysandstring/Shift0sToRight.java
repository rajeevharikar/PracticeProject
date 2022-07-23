package javaarraysandstring;

import java.util.Arrays;

public class Shift0sToRight {
	
	//{1,0,2,0,3,0,0,0}-->{1,2,3,0,0,0,0}
	
	public static void main(String[] args) {
		
		int arr[]= {1,0,2,0,3,0,0,0};
		
		System.out.println(Arrays.toString(shiftAll0sToRight(arr)));
	}

	public static int[] shiftAll0sToRight(int[] arr) {
		
		if(arr.length==1) {
			return arr;
		}
		
		int[] newarr= new int[arr.length];
		
		int count=0;
		
		for(int num:arr) {
			if(num!=0) {
			newarr[count]=num;
			count++;
			}
		}
		
		return newarr;
	}
	
}
