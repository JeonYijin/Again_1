package com.ae.ae.token;

import java.util.StringTokenizer;

public class TokenMain1 {

	public static void main(String[] args) {
		
		String str = "Seoul, 92, 80, 비";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s.trim());
		}
		
		
		
	}

}
