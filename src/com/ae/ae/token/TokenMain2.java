package com.ae.ae.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		
		String str = "Korea-USA-China-france*UK*cAnada-germany";
		
		str = str.replace('*', '-');
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s.toLowerCase());
		}
		
		
		
	}

}
