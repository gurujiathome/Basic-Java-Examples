package com.MatrixOperations;
//one dimensional
public class matrixAddition {
	public static void main(String[] args) {
		int n= 2;

		int a[]=new int[n];
		int b[]= new int [n];
		int sum[]= new int[n];
		a[0]=1;
		a[1]=2;
		b[0]=4;
		b[1]=2;
		for(int i=0;i<=n-1;i++) {
		  sum[i] =a[i]+b[i];
		  System.out.println(sum[i]);
		} 
		
		
	}

}
