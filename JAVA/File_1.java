package com.ust4;

import java.io.File;

public class File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a file object for the current location
		File file=new File("C:\\Users\\ustjavafsdb212\\newFile.txt");
		
		try {
			//trying to create a file based on the object
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created.");
			}
			else {
				System.out.println("The file already exist.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
