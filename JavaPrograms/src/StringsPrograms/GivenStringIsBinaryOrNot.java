package StringsPrograms;

public class GivenStringIsBinaryOrNot {

	public static void main(String[] args) {
		
	String str= "011110";
	boolean b = GivenStringIsBinaryOrNot.isBinary(str);
	
	str.toLowerCase();
	if(b==true) {
		System.out.println(1);
	}else
	{
		System.out.println(0);
	}
	
	}
	
	static boolean isBinary(String str)
	{
	  
	  char[] ch=str.toCharArray();
	  
	  for(int i=0;i<ch.length;i++){
	      if(ch[i]!='1' && ch[i]!='0'){
	          return false;
	      }
	  }
	  
	  return true;
	}
}
