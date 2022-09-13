package com.ust4;

import java.io.FileOutputStream;

public class File_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is a line of text inside the file.";
		try {
			FileOutputStream output=new FileOutputStream("C:\\Users\\ustjavafsdb212\\output.txt");
			
			byte[] array=data.getBytes();
			
			//writes byte to the file
			output.write(array);
			
			output.close();
			
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
