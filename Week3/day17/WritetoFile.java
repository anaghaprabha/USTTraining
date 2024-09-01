package com.learning.day17;

import java.io.*;

public class WritetoFile {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("./xyz.txt");

		String msg = "Hello, how are you?";

		byte arr[] = msg.getBytes();
		fos.write(arr);

		fos.close();

	}

}
