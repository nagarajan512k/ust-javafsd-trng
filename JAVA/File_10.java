package com.ust4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="This is the data in the output file";
		
		try {
			//create a FileWritter
			FileWriter file=new FileWriter("C:\\Users\\ustjavafsdb212\\outputt.txt");
			
			//create a BufferedWriter
			BufferedWriter output=new BufferedWriter(file);
			
			//writes the string to the file
			output.write(data);
			
			//closes the writer
			output.close();
			
			
		}
		catch(Exception e) {
			e.getStackTrace();
			
		}
	}

}
