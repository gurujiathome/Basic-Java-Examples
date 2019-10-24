package com.Patterns;

public class five_group {
	public static void main(String[] args) {
		int n=52;
		int m=1;
		int p=n%5;
		for(int i=1;i<=(n/5);i++) 
		{
			for(int j=1;j<=5;j++) {
				System.out.print(" "+m);
				m=m+1;
			}System.out.println();
		}
		
	}

}
