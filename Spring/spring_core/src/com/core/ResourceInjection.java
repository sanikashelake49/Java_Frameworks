package com.core;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.Resource;

public class ResourceInjection {
	private Resource file;//resource interface

	public ResourceInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceInjection(Resource file) {
		super();
		this.file = file;
	}

	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}
	
	public void process() {  //method to process injected doc from the bean
		String path="D:\\Softra_Spring\\spring_core\\src\\salesforce";
		//get the stream of bytes
		try {
		InputStream is=file.getInputStream();//is- will pointing to 1st line
		OutputStream os=new FileOutputStream(path+file.getFilename());
	
		int c;
		//writing the contents of the file from the bean to the destination file
		while((c = is.read()) != -1)//-1 ref EOF
			os.write(c);
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
	

}
