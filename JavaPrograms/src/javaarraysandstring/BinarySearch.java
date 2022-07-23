package javaarraysandstring;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr= {10,12,25,30,40};
		
		int start=0;
		int end=arr.length-1;
		
		int findElement=12;
		
		while(start <= end) {
			
			int mid= (start + end)/2;
			
			if(arr[mid] == findElement) {
				System.out.println("element found at index "+mid);
				break;
			}
			else if(arr[mid] > findElement) {
				end= mid-1;
			}
			else {
				start=mid+1;
			}
		}
		if(start>end) {
			System.out.println("Element not found");
		}
	}

}
