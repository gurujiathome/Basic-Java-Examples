package fileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file_read {
	public static void main(String[] args) {
		
		try {
			String path ="C:\\Users\\hp\\Desktop\\Java\\dvs.txt";
			FileInputStream fd = new FileInputStream(path);
			FileOutputStream fo = new FileOutputStream(path);
			String ss = " write dnyanesh in file named dvs";
			byte b[]=ss.getBytes();
			fo.write(b);
			System.out.println("success!");
			
			int i =0;
			while((i=fd.read())!=-1) {
				char c=(char)i;
				System.out.print(c);
			}
			fd.close();
			fo.close();
		}catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
