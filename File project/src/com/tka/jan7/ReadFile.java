package com.tka.jan7;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		String path = "C:\\Users\\Khushi's\\OneDrive\\Desktop\\jan 7\\db.txt";

		try (FileInputStream fi = new FileInputStream(path)) {
			System.out.println("File opened successfully");
			int d;
			while ((d = fi.read()) != -1) {
				System.out.print((char) d);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong.....");
			e.printStackTrace();
		}
	}
} 