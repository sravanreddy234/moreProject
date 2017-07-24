/*package com.moreProject.FileUtil;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.annotation.MultipartConfig;

import org.apache.commons.fileupload.MultipartStream;

//import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	public static String upload(String path, MultipartStream stream, String fileName){
		InputStream inputStream=null;
		OutputStream outputStream=null;
				try{
					InputStream=stream.
					inputStream=stream.getInputStream();
					outputStream=new FileOutputStream(path+fileName);
					int readBytes=0;
					byte[] buffer=new byte[1024];
					while((readBytes=inputStream.read(buffer,0,1024))!= -1){
						outputStream.write(buffer, 0, readBytes);
					}
					
									catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						
					}
				finally{
					try{
						outputStream.close();
						inputStream.close();
						
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			
		

	

				}
				return fileName;
}*/