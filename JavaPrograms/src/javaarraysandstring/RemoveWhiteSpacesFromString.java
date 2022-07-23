package javaarraysandstring;

public class RemoveWhiteSpacesFromString {
	
	//Remove white spaces from the given String
	
	public static void main(String[] args) {
		
		String newString = "    Java Selenium Learning   ";
		
		String withoutSpaces="";
		
		for(int i=0;i<newString.length();i++) {
			
			if((newString.charAt(i)!=' ') && (newString.charAt(i)!='\t')) {
				
				withoutSpaces= withoutSpaces + newString.charAt(i);
			}
		}
		System.out.println(withoutSpaces);
	}

}
