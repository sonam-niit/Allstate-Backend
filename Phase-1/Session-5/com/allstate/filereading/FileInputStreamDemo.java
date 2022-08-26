package com.allstate.filereading;

import java.io.FileInputStream;


public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream stream= new FileInputStream("D://files//file1.txt");
			int i=0;
			while((i=stream.read())!=-1) {
				System.out.print((char)i);
			}
			
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
