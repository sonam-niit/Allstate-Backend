package com.allstate.filereading;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try {
			BufferedInputStream stream= new BufferedInputStream(new
					FileInputStream("D://files//file2.txt"));
			
			int i=0;
			while((i=stream.read())!=-1) {
				System.out.print((char)i);
			}
			
			stream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
