package com.Specials;
//Program to calculate largest number from given three numbers
public class Largest {
	public static void main(String[] args) {
		int n1 =7,n2=4,n3=8;
		if(n1>n2&&n1>=n3) {
			System.out.println(n1+"   is the largest number");
			
		}else if (n2>=n1&&n2>=n3) {
			System.out.println(n2+"  is the largest number");
			
		}else {
			System.out.println(n3+"  is the largest number");
			
		}
	}

}
//this can be achieved by using unary operator ?: