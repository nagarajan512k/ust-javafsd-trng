package com.ust4;

import java.io.BufferedReader;
import java.io.FileReader;

public class File_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of character
		char[] array=new char[100];
		
		try {
			//creates a File Reader
			FileReader file=new FileReader("C:\\Users\\ustjavafsdb212\\inputt.txt");
			
			//creates a BufferedReader
			BufferedReader input=new BufferedReader(file);
			
			//Read characters
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			//closes the reader
			input.close();
			
		}
		catch(Exception e){
		e.getStackTrace();
		}
	}

}
