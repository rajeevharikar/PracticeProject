package javaprogramspracticeloops;

import java.util.Scanner;

public class GivenNumberisPerfectorNot {
	
	//Given Number is Perfect or Not
	
	// num =6 divisors of 6= 1,2,3 addition of divisors= 6 then its a perfect number
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int sum=0;
		System.out.println("enter a number");
		int num=scn.nextInt();
		
		for(int i=1;i<num; i++) {
			if(num % i==0) {
			sum= sum + i;
			}
		}
		if(sum==num) {
			System.out.println("number is perfect");
		}else{
			System.out.println("number is not perfect");
			}
		}
	}

