package StringsPrograms;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {

		    String S="    geek    for    geeks   ";
		    String str=""; 
	        for(int i=0;i<S.length();i++){
	        	
	        	if(S.charAt(i) !=' ')
	           {
	               str=str+ S.charAt(i);
	           }
	        } 
	        System.out.println(str);
	    }

}