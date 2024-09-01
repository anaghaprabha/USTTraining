package com.learning.day17;

import java.io.*;

public class ReadFromFile {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./xyz.txt");
		int character ;
		//prints only single character
		//System.out.println("Data from File: "+character);
		//prints after typecasting
		//System.out.println("Data from File after typecasting: "+(char)character);
		//System.out.print((char)character);
		while((character = fis.read())!=-1){
			System.out.print((char)character);
		}
		
		fis.close();
	}

}
