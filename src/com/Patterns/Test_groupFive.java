package com.Patterns;

import java.util.Scanner;

public class Test_groupFive {
	public static void main(String[] args) {
		groupFive fg = new groupFive();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new number :");
		int p = scan.nextInt();		
		fg.groupFive(p);
	}

}
