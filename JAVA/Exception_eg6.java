package com.ust1;
import java.io.*;

public class Exception_eg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
			while ((line=br.readLine())!=null) {
				System.out.println("Line=>"+line);
			}
		}catch(IOException e) {
			System.out.println("IoException in try block=>"+e.getMessage());
		}
	}

}
