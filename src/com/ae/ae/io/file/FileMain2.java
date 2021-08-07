package com.ae.ae.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("폴더명을 입력");
		
		String name = sc.next();
		
		file = new File(file, name);
		
		if(file.exists()) {
			System.out.println("있는 폴더");
		}else {
			System.out.println("없는 폴더");
		}
		
		if(file.exists()) {
			file.delete();
		}else {
			file.mkdirs();
		}
		
		
		
	}

}
