package com.Patterns;

public class Pattern_24 {public static void main(String[] args) {
	int n=5;
	for(int i =1;i<=n;i++) 
	{
		for(int j=n-1;j>=i;j--) 
		{
			System.out.print(" ");
		}
		//this is important stepp
		for (int k=1;k<=i;k++) 
		{
			System.out.print("*");
		}System.out.println();
	}
	
}

}
