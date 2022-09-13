package com.ust4;

import java.io.FileInputStream;

public class File_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream input=new FileInputStream("C:\\Users\\ustjavafsdb212\\inputt.txt");
			
			System.out.println("Data in the file:");
			
			//Reads the first byte
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
