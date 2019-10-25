package com.Specials;
// All copyrights ! Somwanshi Dnyanesh //done by using arrays
//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
public class Fibbonacci_Finder {
	public static void main(String[] args) 
	{
		int n=10;//just change this number
		int a[] =new int [n];
		a[0]=1;
		a[1]=2;
		for (int i=2;i<=n-1;i++) 
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(a[i]);
		}
		System.out.println("Hureyy! This is fibbonacci series.");

	}

}
