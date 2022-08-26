package com.allstate.filewriting;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter writer= new FileWriter("D://files//file3.txt");
			
			writer.write("Welcome to the world of writer classes");
			
			System.out.println("Data Written");
			
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
