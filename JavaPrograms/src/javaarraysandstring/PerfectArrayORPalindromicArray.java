package javaarraysandstring;

public class PerfectArrayORPalindromicArray {
	    
	    public boolean IsPerfect(int a[], int n)
	    {
	        // Complete the function
	        
	        for(int i = 0; i < n/2; i++){
	            if(a[i] != a[n -i -1]) 
	            return false;
	        }
	        
	        return true;
	   
	    }
	    
	    public static void main(String[] args) {
			
	    	int arr[] = {1, 2, 3, 2, 1};
	    	
	    	PerfectArrayORPalindromicArray obj = new PerfectArrayORPalindromicArray();
		    if(obj.IsPerfect(arr, 5))
		        System.out.println("PERFECT");
		    else
		        System.out.println("NOT PERFECT");
	    	
                
                
		}
	}

