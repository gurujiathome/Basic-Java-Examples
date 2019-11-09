package fileRead;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class f_read {
	public static void main(String[] args) {
		String path = "C:\\Users\\hp\\Desktop\\dvs.txt";
		try {
			FileInputStream fid = new FileInputStream(path);
			int i=0;
			while((i=fid.read())!=-1) {
				char c = (char)i;
				System.out.print(c);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
