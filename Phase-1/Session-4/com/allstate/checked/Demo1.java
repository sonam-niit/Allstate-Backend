package com.allstate.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {

	public static void main(String[] args) {

		try {
			FileReader read = new FileReader("D://test//hello.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
