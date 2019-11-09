package fileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy_text {

	public static void main(String[] args) {
		
try {
	String fr = "C:\\Users\\hp\\Desktop\\Java\\dvs.txt";
	String fd = "C:\\Users\\hp\\Desktop\\Java\\danny.txt";
	FileInputStream fis = new FileInputStream(fr);
	FileOutputStream fout = new FileOutputStream(fd);
	 int i =0;
	 while((i=fis.read())!=-1) {
		 fout.write(i);
	 }
	fis.close();
	
}catch (Exception e) {
	e.printStackTrace();
}
	}

}
