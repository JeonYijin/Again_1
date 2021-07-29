package com.re.re.arraylist;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		//ArrayList 메서드
		ArrayList ar = new ArrayList();
		
		ar.add("dd");
		ar.add(23);
		ar.add(true);
		
		ar.remove(2);
		ar.set(0, 55);
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.clear();
		System.out.println(ar.size());
	}

}
