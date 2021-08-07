package com.ae.ae.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {

	public void write2() {
		//id, pw, age 스캐너로 받기
		//c test member1.txt 파일 생성, 입력받은 내용 작성
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File("c:\\test");
		
		File file2 = new File(file, "member1.txt");
		
		System.out.println("id");
		String id = sc.next();
		System.out.println("pw");
		String pw = sc.next();
		System.out.println("age");
		int age = sc.nextInt();
		
		
		try {
			FileWriter fw = new FileWriter(file2, true);
			fw.write(id+"-"+pw+"-"+age+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
