package com.Specials;
//program has error. need to fix it up
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteDate {
	public static void main(String[] args) {
		//System.out.println(new java.util.Date());
		 Date date = new Date();  
		    SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");  
		    String strDate= sdf.format(date);  
		    System.out.println(strDate); 
	}

}
