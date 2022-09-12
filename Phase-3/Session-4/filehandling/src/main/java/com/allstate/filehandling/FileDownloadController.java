package com.allstate.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController {

	@RequestMapping("/download")
	public ResponseEntity<Object> downloadFile() throws FileNotFoundException{
		String filename= "src\\main\\resources\\static\\myfile.txt";
		File file= new File(filename);
		
		InputStreamResource resource= 
				new InputStreamResource(new FileInputStream(file));
		
		HttpHeaders headers= new HttpHeaders();
		headers.add("Content-Disposition", 
				String.format("attachment;filename=\"%s\"", 
						file.getName()));
		headers.add("cache-control", 
				"no-cache,no-store,must-revalidate");
		headers.add("Expires", "0");
		
		ResponseEntity<Object> object= ResponseEntity.ok().
				headers(headers).contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/txt"))
				.body(resource);
		
		return object;
	}
}
