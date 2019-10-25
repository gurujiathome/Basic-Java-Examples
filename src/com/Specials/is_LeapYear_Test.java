package com.Specials;

import java.util.Scanner;

//testing for is_LeapYear()
public class is_LeapYear_Test {
	public static void main(String[] args) {
		
		System.out.println("Enter a year :");
		int n =new Scanner(System.in).nextInt();
		is_LeapYear leap = new is_LeapYear();
		leap.leap_year(n);
		//pass integer value 
		
	}

}
