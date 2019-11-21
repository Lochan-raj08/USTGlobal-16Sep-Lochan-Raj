package com.ustglobal.filehandling;


import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\dell\\Desktop\\TEXT.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}//End of main

}// end of fileReadingClass
