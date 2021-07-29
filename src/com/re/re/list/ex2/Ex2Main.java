package com.re.re.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		MyList mylist = new MyList();
		
		ar.add(3);
		ar.add(6);
		
		mylist.add(ar, 45);
		mylist.add(ar, 1);
		
		mylist.remove(ar);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
	}

}
