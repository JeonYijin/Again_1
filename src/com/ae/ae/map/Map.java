package com.ae.ae.map;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("n1", 10);
		map.put("n2", 5);
		
		map.put("n3", 1);
		map.put("n2", 50); // 같은 key에 다른 value를 넣으면 덮어쓰기
		
		Iterator<String> keys = map.keySet().iterator(); 
		while(keys.hasNext()) { 
			String key = keys.next(); //key를 뽑아서 저장
			int num = map.get(key); // key에 해당하는 value num에 저장
			System.out.println(num);
		}
		System.out.println(map);
		
	}

}
