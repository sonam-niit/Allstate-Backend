package com.allstate.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UpdateFile {

	public static void modifyFile(String file, String oldString, String newString) {
		
		File fileToBeModified= new File(file);
		String fileOldData="";
		BufferedReader reader=null;
		FileWriter writer=null;
		
		try {
			//Read the file into memory
			reader= new BufferedReader(new FileReader(fileToBeModified));
			String line= reader.readLine();
			while(line!=null) {
				fileOldData=fileOldData+line+System.lineSeparator();
				line=reader.readLine();
			}
			
			//Let's update the data
			String fileNewData= fileOldData.replaceAll(oldString, newString);
			//Let's Modify the original file by writing data to that file
			writer= new FileWriter(fileToBeModified);
			writer.write(fileNewData);
			System.out.println("file Updated Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		modifyFile("D://files//file5.txt", "Line", "Record");
	}
}
