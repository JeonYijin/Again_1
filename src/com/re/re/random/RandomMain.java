package com.re.re.random;

import java.util.ArrayList;
import java.util.HashSet;

public class RandomMain {

	public static void main(String[] args) {
		
		int [] nums = new int[6];
		Lotto lotto = new Lotto();
		ArrayList<Integer> ar = new ArrayList<>();
		HashSet<Integer> hashset = new HashSet<>();
		
		
		nums = lotto.makeLotto();
		//ar = lotto.makeLotto2();
		hashset = lotto.makeLotto3();
		
		System.out.println(hashset);
		
//		for(int i=0; i<ar.size(); i++) {
//			System.out.println(ar.get(i));
//		}
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
	}

}
