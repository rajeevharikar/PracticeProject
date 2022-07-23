package javaarraysandstring;

public class DisplayLongestName {
	
	static String  longest(String names[], int n) {
        int max=0;
       
        String longestName="";
        for(int i=0;i<n;i++){
        	 int count=0;
            char letters[]= names[i].toCharArray();
            
            for(int j=0;j<letters.length;j++){
                
                count++;
            }
            
            if(count>max){
                max=count;
               longestName=names[i];
            }
            
        }
        
        return longestName;
    }
	
	public static void main(String[] args) {
		
		String names[]= {"abc","ab","a"};
		System.out.println(DisplayLongestName.longest(names, 3));
	}

}
