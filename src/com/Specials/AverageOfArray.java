package com.Specials;

public class AverageOfArray {
	public static void main(String[] args) {
		double []numArray= {45.6, 67.7, 34.8, 67.9, 78.5};
		double sum=0.0;
		for(int i=0;i < numArray.length; i++) {
			sum =sum + numArray[i];
		}
		double average =sum/numArray.length;
		System.out.println("The average is : "+average);
	}

}
