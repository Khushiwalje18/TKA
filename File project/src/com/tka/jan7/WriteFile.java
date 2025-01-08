package com.tka.jan7;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {

		String path = "newFile.txt";
		FileOutputStream fo = null;

		try {
			fo = new FileOutputStream(path);
			System.out.println("File open in write mode");
			String data = "Welcome to new file";
			byte[] b = data.getBytes();
			fo.write(b);
		} catch (IOException e) {
			System.out.println("something went wrong...");
			e.printStackTrace();

		}finally {
			if(fo != null) {
				fo.close();
				System.out.println("file closed successfully");
			}
		}
	}
}
