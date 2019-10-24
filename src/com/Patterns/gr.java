package com.Patterns;
//Huraay! divide any number in the group of five
public class gr {
	public static void main(String[] args) {

	int n= 63;
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
