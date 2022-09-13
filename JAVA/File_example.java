package com.ust4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ustjavafsdb212\\AB.txt");
		
		try
		{
			FileOutputStream fstm=new FileOutputStream(f);
			byte[] b="This i am writting to file.".getBytes();
			if(f.createNewFile())
			{
				System.out.println("New file created.");
				
			}
			else
			{
				System.out.println("File Exist");
				fstm.write(b);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
