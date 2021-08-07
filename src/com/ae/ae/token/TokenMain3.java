package com.ae.ae.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		
		String str1 = "Korea-usa-france";
		
		String [] s= str1.split("-");
		
		Nation [] nation = new Nation[3];
		
		for(int i=0; i<nation.length; i++) {
			Nation n = new Nation();
			n.setName(s[i]);
			nation[i] = n;
		//	System.out.println(nation[i].getName());
		}
		
		StringTokenizer st = new StringTokenizer(str1, "-");
		int i =0;
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			Nation n = new Nation();
			n.setName(name);
			nation[i] = n;
			i++;
		}
		
//		for(int j=0; j<nation.length; j++) {
//			System.out.println(nation[j].getName());
//		}
		
		
		
		String str2 = "note10-100-ipone6s-90-note20ultra-148";
		
		StringTokenizer stt = new StringTokenizer(str2,"-");
		
		while(stt.hasMoreTokens()) {
			Phone phone = new Phone();
			phone.setName(stt.nextToken());
			phone.setPrice(stt.nextToken());
			System.out.println(phone.getName());
			System.out.println(phone.getPrice());
		}
		

		
		
		
	}

}
