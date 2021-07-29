package com.re.re.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set_1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(27);
		hashset.add(74);
		hashset.add(98);
		
		System.out.println(hashset);
		
		//hashset.remove(27);
		
		Iterator<Integer> it = hashset.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		
	}

}
