package StringsPrograms;

public class FrontBackTransformation {

	/*
	 * Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are 
replaced by their respective upper or lower case 
letters accordingly.
	 */
	
	
	public static void main(String[] args) {
		 
		        String str = "Hello";
		       StringBuilder sb=new StringBuilder();
		       
		       for(int i=0;i<str.length();i++)
		       {
		           char ch=str.charAt(i);
		           if(ch>='a' && ch<='z'){
		           int off=ch-'a';
		           char nch=(char)('z'-off);
		           sb.append(nch);
		           }
		           else{
		               int off=ch-'A';
		               char nch=(char)('Z'-off);
		               sb.append(nch);
		           }
		       }
		       System.out.println(sb.toString());
		   }
	}
