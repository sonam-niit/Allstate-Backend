package com.allstate.filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNIODemo {

	public static void main(String[] args) {
		
		Path path= Paths.get("D://files//file4.txt");
		String msg= " Welcome to My NIO Demo";
		byte array[]= msg.getBytes();
		
		try {
			Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			System.out.println("Data Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
