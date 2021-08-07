package com.ae.ae.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test", "name.txt");
		
		FileReader fr =  null;
		BufferedReader br = null;
		try {
		fr =  new FileReader(file);
		br =  new BufferedReader(fr);
		ArrayList<FileMember> ar = new ArrayList<>();
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			
			FileMember fileMember = new FileMember();
			String [] sts = str.split(",");
			fileMember.setId(sts[0]);
			fileMember.setPw(sts[1]);
			fileMember.setAge(Integer.parseInt(sts[2]));
			ar.add(fileMember);
			
		}
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println("id: "+ar.get(i).getId());
			System.out.println("pw: "+ar.get(i).getPw());
			System.out.println("age: "+ar.get(i).getAge());
			System.out.println("--------------");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
