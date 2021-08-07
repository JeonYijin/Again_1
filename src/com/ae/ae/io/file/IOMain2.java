package com.ae.ae.io.file;

import java.util.Calendar;
import java.util.UUID;

public class IOMain2 {

	public static void main(String[] args) {
		
		String fileName = "";
		
		fileName = "abc";
		
		Calendar calendar = Calendar.getInstance();
		
		long t = calendar.getTimeInMillis();
		
		fileName = String.valueOf("fileName : "+ t);
		System.out.println(fileName);
		
		fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
		
		
	}

}
