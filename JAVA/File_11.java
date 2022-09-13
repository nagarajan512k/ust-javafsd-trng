package com.ust4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class File_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//creates a FileInputStream
			FileInputStream file=new FileInputStream("C:\\Users\\ustjavafsdb212\\inputt.txt");
			
			//creates a BufferedInputStream
			BufferedInputStream input=new BufferedInputStream(file);
			
			//Reads first byte from the file
			int i=input.read();
			
			while(i!=-1) {
				System.out.println((char)i);
				
				//Reads next byte from the file
				i=input.read();
				
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
