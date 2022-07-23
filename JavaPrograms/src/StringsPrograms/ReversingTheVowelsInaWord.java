package StringsPrograms;

public class ReversingTheVowelsInaWord {
		
	/*Input: S = "practice"
      Output: prectica
      Explanation: The vowels are a, i, e
      Reverse of these is e, i, a.
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
	
	String s="practice";
	char c[]=s.toCharArray();
	int i = 0,j=s.length()-1;
	while(i<j) {
		if(c[i]=='a' || c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u')	{
			if(c[j]=='a' || c[j]=='e' ||c[j]=='i' ||c[j]=='o' ||c[j]=='u'){
				
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				j--;
				i++;
			}else
			{
				j--;
			}
		}
		else {
			i++;
		}
	}
	String str=new String(c);
System.out.println(str);
	
	}

}

//String modify (String s)
//{
//    int d=-1;
//    String n="";
//    List<String> vowels=new ArrayList<>();
//    for(int i=s.length()-1;i>=0;i--){
//        char value=s.charAt(i);
//        if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u'){
//            vowels.add(String.valueOf(value));
//        }
//    }
//    for(int i=0;i<s.length();i++){
//        char b=s.charAt(i);
//        if(b=='a'|| b=='e'|| b=='i'|| b=='o'|| b=='u'){
//            d=d+1;
//            n=n+vowels.get(d);
//        }else{
//            n=n+String.valueOf(b);
//        }
//    }
//    return n;
//}
//}
