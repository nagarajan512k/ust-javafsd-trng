package com.ust4;

import java.io.FileInputStream;
import java.io.InputStream;

public class File_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] array=new byte[100];
		
		try {
			InputStream input=new FileInputStream("C:\\Users\\ustjavafsdb212\\inputt.txt");
			
			System.out.println("Available bytes in the file:"+input.available());
			
			//Read byte from the input stream
			input.read(array);
			System.out.println("Data read from the file");
			
			//convert byte array into string
			String data=new String(array);
			System.out.println(data);
			
			//close the input stream
			input.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
