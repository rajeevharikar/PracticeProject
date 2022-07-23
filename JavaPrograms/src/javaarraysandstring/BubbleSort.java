package javaarraysandstring;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr= {12,7,3,9,1};
		
		
		for(int i=0;i<arr.length-1; i++) {
			
			boolean isSorted=true;
			
			for(int j=0;j<arr.length - 1 -i; j++)
			{
				if(arr[j] > arr[j+1])
				{
				int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
					isSorted=false;
				}
			}
			if(isSorted)
				break;
			}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	
	}
}
