package fileRead;

import java.io.Console;

public class consol_read {
//String c = null;
	public static void main(String[] args) {
		Console c =System.console();
		System.out.println("Enter your name :");
		String name = c.readLine();
		System.out.println("Hello "+name);

	}

}
