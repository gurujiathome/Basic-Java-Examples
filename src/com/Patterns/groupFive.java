package com.Patterns;

import java.util.Scanner;

//Huraay! this program will set  any number in the group of five consecutive numbers
//This is Expected Results
/*1 2 3 4 5
6 7 8 9 10
11*/


public class groupFive {
	/*public static void main(String[] args) {
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

*/	public void groupFive(int n) {
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
