package com.Patterns;

import java.util.Scanner;

public class CreateArray {
	public static void main(String[] args) {
		int m = 0;
		int a[]=new int[4];
		Scanner scan = new Scanner(System.in);
		
		
		while(m<=3) {
			System.out.println("Enter number :");
		int bz= scan.nextInt();
		a[m]=bz;
		m=m+1;
		}
		System.out.println(a[m]);
		System.out.println("Its Raining outside!");
		
				
	}

}
