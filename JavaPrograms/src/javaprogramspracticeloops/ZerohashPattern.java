package javaprogramspracticeloops;

public class ZerohashPattern {

	public static void main(String[] args) {
		
		int i=0;
	
	for(;i<5;i++){
		  
	       if(i%2==0){
	         for(int j=0;j<5;j++){

	         if(j%2==0){
	         System.out.print("0");
	         }else{
	        	 System.out.print("#");
	         }
	         }
	       }
	         else{
	        	 System.out.println("");
	        	 {
	    	         for(int j=1;j<6;j++){
	    	         if(j%2==0){
	    	         System.out.print("0");
	    	         }else{
	    	        	 System.out.print("#");
	    	         }
	    	         }
	    	       }
	        	 System.out.println();
	}
}
	}
}
