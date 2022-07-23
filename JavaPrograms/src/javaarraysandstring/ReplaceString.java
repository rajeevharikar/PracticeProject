package javaarraysandstring;

public class ReplaceString {
	
	
	public static void main(String[] args) {
		String r="A";

		String finalstr="";

		String str= "Test Java Selenium";

		   String[] words=str.split(" ");


		for(int i=0;i<words.length;i++){
			
			finalstr= finalstr+words[i].replace(words[i].substring(0, 1),r)+ " ";
		
		}
		
		System.out.println(finalstr);

	}

}
