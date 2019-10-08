package com.Specials;

public class LargestNumberInArray {
	public static void main(String[] args) {
		double[] numArray= { 45.6,67.7,34.8,67.9,78.5};
		double largest = numArray[0];
		System.out.println(largest);
		for (int i =0;i<numArray.length;i++) {
			if(largest<numArray[i]) {
				System.out.println("I am in if "+ largest);
				System.out.println("I am in if "+ numArray[i]);
				largest =numArray[i];
			}
		}
		System.out.format("Largest element =%.2f", largest);
	}

}
