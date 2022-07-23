package javaprogramspracticeloops;

public class SeparateEachDigitFromNumber {
	
	public static void main(String[] args) {
		
		int num=123;
		
		while(num!=0) {
			
			System.out.println(num%10);//to seperate the last digit we do modulus % operation here it will give 3
			num=num/10;//by dividing we will get the number apart from last number here it is 12
		}
		
	}

}
