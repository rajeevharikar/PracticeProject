package StringsPrograms;

public class CountTypeOfCharacters {
	
	public static void main(String[] args) {
		
		String S = "#GeeKs01fOr@gEEks07";
		
		int Upper=0,lower=0,neumeric=0,special=0;
		
		int[] finall= new int[4];
		char ch[]=S.toCharArray();
		
		for(int i=0;i<S.length();i++) {
		
		if(Character.isUpperCase(ch[i])) {
			Upper++;
		}
		else if (Character.isLowerCase(ch[i])) {
			lower++;
		}
		else if(Character.isDigit(ch[i])) {
			neumeric++;
		}
		else {
			special++;	
		}
		
		}
		
		for(int j=0;j<finall.length;j++) {
			finall[j]=Upper;
			finall[j]=lower;
			finall[j]=neumeric;
			finall[j]=special;
		}
		
		System.out.println(finall);
	}

}
