package com.re.re.random;

public class PasswordMain {

	public static void main(String[] args) {
		
		Password pass = new Password();
		String p;
		
		p = pass.makePassword();
		System.out.println(p);
		
	}

}
