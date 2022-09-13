package com.ust4;

import java.io.File;

public class File_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("file.txt");
		
		//deletes the file
		boolean value=file.delete();
		if(value) {
			System.out.println("The file is deleted.");
		}
		else
		{
			System.out.println("The file is not deleted");
		}

	}

}
