package com.ust4;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class File_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="This is a line of text inside the file.";
		
		try {
			OutputStream out=new FileOutputStream("C:\\Users\\ustjavafsdb212\\output.txt");
			
			//converts the string into bytes
			byte[] dataBytes=data.getBytes();
			
			//writes data to the output stream
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			
			//closes the output stream
			out.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
