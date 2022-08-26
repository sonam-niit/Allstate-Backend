package com.allstate.fileoperation;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) {
		Path path = Paths.get("D://files//file1.txt");

		try {
			if (Files.deleteIfExists(path))
				System.out.println("File Deleted Successfully");
			else
				System.out.println("File not available");

		} catch (NoSuchFileException e) {
			System.out.println("No such file exist");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory not Empty");
		} catch (IOException e) {
			System.out.println("invalid Permission");
		}
	}
}
