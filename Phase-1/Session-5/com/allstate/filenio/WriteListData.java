package com.allstate.filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteListData {

public static void main(String[] args) {
		
		Path path= Paths.get("D://files//file5.txt");
		List<String> list= Arrays.asList("This is my Line1",
				"This is my Line2");
		try {
			Files.write(path, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			System.out.println("Data Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
