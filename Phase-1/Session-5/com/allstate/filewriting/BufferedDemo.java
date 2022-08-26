package com.allstate.filewriting;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedDemo {

	public static void main(String[] args) {
		
		try {
			BufferedOutputStream stream= new BufferedOutputStream(new
					FileOutputStream("D://files//file2.txt"));
			
			String msg= "Welcome.... Good Morning..!!!";
			stream.write(msg.getBytes());
			
			System.out.println("Data Written to the file");
			
			stream.flush();
			stream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
