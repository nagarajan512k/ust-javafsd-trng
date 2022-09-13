package com.ust4;

import java.io.File;

public class File_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a file object
		File file=new File("C:\\Users\\ustjavafsdb212");
		
		//returns an array of all files
		String[] fileList=file.list();
		
		for(String str:fileList) {
			System.out.println(str);
		}
	}

}
