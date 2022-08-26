package com.allstate.filewriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileOutputStream writer=null;
		try {
			writer = new FileOutputStream("D://files//file1.txt",true);
			String message = " My Name is Sonam Soni";
			byte b[] = message.getBytes();
			writer.write(b);
			System.out.println("Data Written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
