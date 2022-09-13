package com.ust4;

import java.io.FileReader;

public class File_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] array=new char[100];
		try {
			//create a reader using the FileReader
			FileReader input=new FileReader("C:\\Users\\ustjavafsdb212\\inputt.txt");
			
			//Reads characters
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			//close the reader
			input.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
