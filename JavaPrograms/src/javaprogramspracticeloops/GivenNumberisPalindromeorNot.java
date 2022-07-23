package javaprogramspracticeloops;

import java.util.Scanner;

public class GivenNumberisPalindromeorNot {
	
	//Given Number is Palindrome or Not
	
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int backUp=num;
		int rev=0;
		
		while(num>0) {
			rev= rev*10 + num%10;
			num = num /10;
		}
		
		if(rev==backUp) {
			System.out.println("number is a palindrome");
		}else
		{
			System.out.println("number is not a palindrome");
		}
		
	}

}
