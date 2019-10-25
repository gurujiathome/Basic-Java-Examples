package com.Specials;
// error is there ! Need to fix
public class arrayGreatest {
	public static void main(String[] args) {
		int x[]= {2,3,5,6,7,8};
		int min = x[0];
		for(int i=0;i<=x.length;i++ ) 
		{
			if(x[i]<min) {
				x[i]=min;
				System.out.println("I m still in loop"+ x[i]);
				
			}
			System.out.println(x[i]);
		}
	}

}
