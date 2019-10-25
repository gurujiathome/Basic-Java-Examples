package com.Specials;
//This Program reverses the number
import java.util.Scanner;

public class Reversal {
	public static void main(String[] args) {
		//int a=2368;
		int b;
		int d=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new Numberto reverse : ");
		int a = scan.nextInt();
		while(a>0) {
			b=a%10;
			a= a/10;
			
			d=(10*d)+b;
			
		}
		
		System.out.println("Reverse of Number is :"+d);
	}

}
