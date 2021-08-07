package com.ae.ae.io.file;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test");
		
		boolean result = file.exists(); // 파일이나 폴더가 존재하는지
		
		result = file.isDirectory(); // 해당 폴더가 있는지
		System.out.println(result);
		
		File file2 = new File(file, "TEST123.txt");
		
		File file3 = new File(file, "tEST12.txt");
		
		result = file2.exists();
		System.out.println(result);
		
	}

}
