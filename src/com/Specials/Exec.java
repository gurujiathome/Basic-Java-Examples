package com.Specials;

import java.io.IOException;
import java.util.StringTokenizer;

public class Exec {
	public static void main(String[] args) throws IOException {
		//Runtime.getRuntime().exec("C:\\Program Files\\PuTTY\\puttygen.exe");
		
		
		String xx ="Math by Dnyanesh";
		//10 methods
		boolean bb = xx.equals("hello");
	    System.out.println(bb);
	    char rr = xx.charAt(3);
	    System.out.println("Character type is  "+rr);
	    System.out.println("Length  is  "+xx.length());
	    
	    boolean em = xx.isEmpty();
	    System.out.println("The given string is has "+em);
	    
	/*   byte[] bit =  xx.getBytes();
	   System.out.println("Byte type is  "+bit);
	   boolean start =  xx.startsWith("M");*/
	  System.out.println("entered into split");
	   String[] k = xx.split(" ");
	   
	   for (int i =0 ;i<k.length;i++) {
		   System.out.println(k[i]);
	   }
	   
	   
	   System.out.println("Entered into tokenizer");
	   StringTokenizer st= new StringTokenizer(xx," ");
	   while(st.hasMoreTokens()) {
		   System.out.println(st.nextToken());
	   }
	   
	   
	    
	}


}
