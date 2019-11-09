package fileRead;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class conc {
	public static void main(String[] args) {
		try {

			String path1 = "C:\\Users\\hp\\Desktop\\Java\\dvs.txt";
			String path2 = "C:\\Users\\hp\\Desktop\\Java\\danny.txt";
			FileInputStream fin1 = new FileInputStream(path1);
			FileInputStream fin2 = new FileInputStream(path2);
			SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
			int i=0;
			while((i=sin.read())!=-1) {
				System.out.print((char)i);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
