package com.tka.jan7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPdfFile {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\Khushi's\\OneDrive\\Desktop\\jan 7\\birth.pdf";
		String path2 = "C:\\Users\\Khushi's\\OneDrive\\Desktop\\jan 7\\birthcopy.pdf";

		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(path1);
			fo = new FileOutputStream(path2);
			System.out.println("PDF files opened succeefully");
			int d;
			while ((d = fi.read()) != -1) {
				fo.write(d);
			}
		} catch (IOException e) {
			System.out.println("something went wrong....");
			// TODO: handle exception
		} finally {
			if (fi != null && fo != null) {
				fi.close();
				fo.close();
				System.out.println("Files closed successfully");
			}
		}
	}
}
