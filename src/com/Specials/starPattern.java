package com.Specials;

import java.util.Scanner;

public class starPattern {
	public static void main(String[] args) {
		System.out.println("Enter  the number : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int px=n;
		int py=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n *2;j++) {
				if(j>=px&&j<=py) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			px--;
			py++;
			System.out.println();
		}
		
	}

}
