package javaarraysandstring;

public class LeadersInArray {
	
	//{100,9,20,10,5,1}
	//leaders = 1,20,10,100
	
	
	public static void main(String[] args) {
		
	int arr[]= {2,1,2,10,1,5};
	
	System.out.println(arr[arr.length-1]);
	
	int maxarrayvalue= arr[arr.length-1];
	
	for(int i=arr.length-2;i>=0;i--) {
		
		if(arr[i] > maxarrayvalue) {
			maxarrayvalue=arr[i];
			System.out.println(maxarrayvalue);
		}
	}
  }
}
