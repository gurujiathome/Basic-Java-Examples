package com.Specials;

public class is_LeapYear {
	 void leap_year(int n) {
		//int n= 1188;
		if((((n%400)!=0)&&((n%100)==0))||((n%4)!=0)) {
			System.out.println(n +" is not Leap year");
			
		}else {
			System.out.println(n+" is Leap year");
		}
	}

}
