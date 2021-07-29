package com.re.re.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {

	//makeLotto 메서드명
	//1-45 6개 중복 x
	
	//hashset
	
	public HashSet<Integer> makeLotto3(){
		
		HashSet<Integer> hashset = new HashSet<>();
		Random random = new Random();
		
		while(hashset.size() !=6) {
			hashset.add(random.nextInt(45)+1);
		}
		
		return hashset;
		
	}
	
	
	
	//배열
	public int[] makeLotto() {
		Random random = new Random();
		
		int[] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(45) +1;
			for(int j=0; j<i; j++) {
				if(nums[i] ==nums[j]) {
					i--;
					break;
				}
			}
		}
		
		return nums;
		
	}
	
	//arraylist
	
	public ArrayList<Integer> makeLotto2(){
		ArrayList<Integer> ar = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<6; i++) {
			ar.add(random.nextInt(45)+1);
			for(int j=0; j<i; j++) {
				if(ar.get(i) == ar.get(j)) {
					System.out.println("중복: "+ar.get(i));
					i--;
					
					break;
				}
			}
			
		}
		return ar;
	}
	
	
}
