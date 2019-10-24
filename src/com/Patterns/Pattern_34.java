package com.Patterns;
//pyramid programme
public class Pattern_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int sx=n;
		int sy=n;
		for (int i= 1;i<=n;i++) 
		{
			for(int j=1;j<=2*n;j++)
			{
				if(j>=sx&&j<=sy) 
				{
					System.out.print("*");
					
				}
				else 
				{
					System.out.print(" ");
				}
		}
			sx--;
			sy++;
			System.out.println();

	}

	}}
