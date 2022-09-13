package com.ust4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception_3 {
	//declaring the type of exception
	public static void findFile()throws IOException{
		
		//code that may generate IoException
		File newFile=new File("test1.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
