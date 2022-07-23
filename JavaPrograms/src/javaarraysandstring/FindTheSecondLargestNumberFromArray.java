package javaarraysandstring;

public class FindTheSecondLargestNumberFromArray {
	
	public static void main(String[] args) {
		
//		int[] arr= {20,12,70,22,100,51};
//		int[] arr= {20,20,20,20,20,10};
		int[] arr= {20,20,20,20,20,20};
		
		int num=secondLargestNumber(arr);	
		System.out.println(num);
	}
	
	public static int secondLargestNumber(int[] arr) {
		
		int FL;
		int SL;
		
		if(arr.length<2) {
			System.out.println("array not eligible for further assessment");
		}
		
		if(arr[0]>arr[1]) {
			FL=arr[0];
			SL=arr[1];
		}
		else if(arr[0]<arr[1]){
			FL=arr[1];
			SL=arr[0];
		}
		else {
			FL=arr[1];
			SL=0;
		}
		boolean flag=false;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>FL) {
				SL=FL;
				FL= arr[i];
				flag=true;
			}
			else if (arr[i]<FL && arr[i]>SL) {
				SL=arr[i];
				flag=true;
			}
		}	
		if(flag==true){
	        return SL;
	        }
	        else{
	            return -1;
	        }
	}
}
