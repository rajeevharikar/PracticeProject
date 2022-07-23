package javaarraysandstring;

public class CheckNumberIsArmstrongOrNarcissisticNumber {
	
	//153  1^3 + 5^3 + 3^3 =153
	//1645 1^4 + 6^4 + 4^4 + 5^5= 1645
	
	public static void main(String[] args) {
		
		System.out.println(isNumberAramstrongOrNot(1645));
		
	}
	
	public static int power(int num) {
		
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	
	
	public static boolean isNumberAramstrongOrNot(int num) {
		
		if(num >0 && num<=9) {
			return true;
		}
		
		if(num<0) {
			return false;
		}
		
		
		int copyNum = num;
		int power = power(num);
        int sum=0;
		while(copyNum!=0) {
			
		int	lastdigit= copyNum % 10;
		
		int factor=1;
		
		for(int i=0;i<power;i++) {
			 factor = factor * lastdigit;	
		}
		sum= sum + factor;

		copyNum= copyNum/10;
		}
		if(sum==num) {
			
			return true;
		}
		else {
			return false;
		}
	}
	

}
