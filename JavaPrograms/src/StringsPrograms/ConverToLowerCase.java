package StringsPrograms;

//ASCII value of A=65
//ASCII value of a=97 so 65+ 32=97

public class ConverToLowerCase {

	public static void main(String[] args) {
		
		String str = "ABCddE";
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
		if(ch[i]>='A' && ch[i]<='Z')
		{
		  ch[i] = (char)((int)ch[i]+32);
		}
		}
		String s= String.valueOf(ch);
		System.out.println(s);
	}
	
	
}
