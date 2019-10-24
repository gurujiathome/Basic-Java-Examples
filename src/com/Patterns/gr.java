package com.Patterns;

import java.util.Scanner;

//Huraay! this program will set  any number in the group of five consecutive numbers
public class gr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int n=scan.nextInt();
	//int n= 63;
	int i=1;
	while(n>=1) {
		
		n=n-1;
		if((i-1)%5==0) {
			System.out.println();
		}
		System.out.print(i);
		System.out.print(" ");
		i=i+1;
		
	}
		
	}

}
