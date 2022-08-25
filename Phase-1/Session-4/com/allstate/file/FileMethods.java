package com.allstate.file;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		
		File file= new File("D://files//test.txt");
		
		if(file.createNewFile())
			System.out.println("file created successfully");
		else
			System.out.println("file already exist");
		
		System.out.println("can Read? "+file.canRead());
		System.out.println("can Write? "+file.canWrite());
		System.out.println("Exist: "+file.exists());
		System.out.println("Name: "+file.getName());
		System.out.println("Full Path: "+file.getAbsolutePath());
		System.out.println("File Size: "+file.length());
		
		File dir= new File("D://sonamfiles");
		if(dir.mkdir())
			System.out.println("Directory created");
		else
			System.out.println("Already Exist");
		
	}
}
