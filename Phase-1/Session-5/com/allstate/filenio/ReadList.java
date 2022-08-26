package com.allstate.filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadList {

	public static void main(String[] args) {
		
		List<String> list= Collections.emptyList();
		Path path= Paths.get("D://files//file5.txt");
		try {
			list= Files.readAllLines(path);
			
			System.out.println(list);
			//display it by iterator or foreach
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
