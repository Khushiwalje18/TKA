package com.tka.jan7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextFile {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Khushi's\\OneDrive\\Desktop\\jan 7\\db.txt";
		String path2 = "C:\\Users\\Khushi's\\OneDrive\\Desktop\\jan 7\\dbcopy.txt";
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(path);
			fo = new FileOutputStream(path2);
			System.out.println("Files opened successfully");
			int d;
			while ((d = fi.read()) != -1) {
				fo.write(d);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong.....");
			e.printStackTrace();
		} finally {
			if (fi != null && fo != null) {
				fi.close();
				fo.close();
				System.out.println("Files closed successfully");

			}
		}
	}
} 