package javaprogramspracticeloops;

import java.util.Scanner;

public class MaxDigitFromGivenNumber {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int max=num%10;
		
		while(num>0) {
			
			if(num%10>max) {
				max= num%10;
			}
			num=num/10;
		}
		
		System.out.println(max);
	}
	
}
