package com.allstate.filereading;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
		FileReader reader= new FileReader("D://files//file3.txt");
		
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
