package com.ust1;
import java.io.*;

public class Exception_eg3 {
//declaring the type of execution
	public static void findFile()throws IOException{
		// TODO Auto-generated method stub
		//code that may generate IOException
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}
	
public static void main(String args[]) {
	try {
		findFile();
		
	}
	catch(IOException e) {
		System.out.println(e);
	}
}
}
