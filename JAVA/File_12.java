package com.ust4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class File_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="This is a line of text inside the file";
		
		try {
			//creates a FileOutputStream
			FileOutputStream file=new FileOutputStream("C:\\Users\\ustjavafsdb212\\outputtt.txt");
			
			//creates a BufferedOutputStream
			BufferedOutputStream output=new BufferedOutputStream(file);
			
			byte[] array=data.getBytes();
			
			//writes data to the output stream
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
			
		}
	}

}
