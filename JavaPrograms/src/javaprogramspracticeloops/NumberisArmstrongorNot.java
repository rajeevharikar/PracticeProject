package javaprogramspracticeloops;

import java.util.Scanner;

public class NumberisArmstrongorNot {
	
	//Given Number is Armstrong or Not
	
	// num =153  1^3 + 5^3 + 3^3 = 153 addition of cube of all digits equals to the number 
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int backUp=num;
		int sum=0;
		
		while(num>0) {
			sum= sum + (num%10) * (num%10) * (num%10);
			num= num / 10;
		}
		
		if(sum==backUp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}
	}

}
