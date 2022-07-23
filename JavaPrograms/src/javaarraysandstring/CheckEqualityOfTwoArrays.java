package javaarraysandstring;

public class CheckEqualityOfTwoArrays {
	
	//Java Program To Check Equality Of Two Arrays
	
	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40};
		int[] arr2= {10,20,30,40};
		boolean isequals=true;
		
		if(arr1.length==arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				
				if(arr1[i]!=arr2[i]) {
					isequals=false;
					break;
				}
			}
		}
		else
			isequals=false;
		
		if(isequals) {
			System.out.println("two arryays are equal");
		}
		else
		{
			System.out.println("two arrays are not equal");
		}
	}
	

}
