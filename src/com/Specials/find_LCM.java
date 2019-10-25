package com.Specials;
//findLCM of any two positive numbers
public class find_LCM {
	public static void main(String[] args) {
		int m=30;
		int n= 40;
		int bigger;
		int smaller;
		if(m>n) 
		{
			 bigger=m;
			 smaller =n;
			}
		else 
			{
				bigger=n;
		        smaller =m;
		      }
		//outside for
		
		for (int i=1;i<=bigger;i++) {
			if (((bigger)*i)%(smaller)==0) {
				int lcm = bigger*i;
				System.out.println(lcm);
				break;
				
			}
			
		}
	}

}
