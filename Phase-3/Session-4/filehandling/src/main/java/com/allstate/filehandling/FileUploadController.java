package com.allstate.filehandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	@RequestMapping(value = "/upload",
			method = RequestMethod.POST)
	public String fileUpload(@RequestParam 
			MultipartFile file) {
		
		String msg="";
		try {
			byte array[]=file.getBytes();
			Path path=Paths.get("D://files//"+
			file.getOriginalFilename());
			Files.write(path, array);
			msg="File Uploaded successfully";
		} catch (Exception e) {
			msg="error occured "+e.getMessage();
		}
		
		return msg;
	}
}
