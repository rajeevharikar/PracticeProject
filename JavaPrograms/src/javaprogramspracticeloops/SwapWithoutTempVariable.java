package javaprogramspracticeloops;

public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		
		int a=10,b=30;
		
		a=a+b; //40
		b=a-b; //10
		a=a-b; //30
		
		//also
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		System.out.println("Print--a "+a);
		System.out.println("Print--b "+ b);
	}
}
