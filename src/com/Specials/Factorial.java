package com.Specials;
//finding the factorial;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//int n = 4;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n= scan.nextInt();
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of " +n+" is :"+fact);
		
	}

}
