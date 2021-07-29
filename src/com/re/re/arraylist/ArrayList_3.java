package com.re.re.arraylist;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<Member> member = new ArrayList<>();
		
		//먼저 Member 객체를 만들고 값을 담은 후 arraylist에 담을 때
		Member mem = new Member();
		 mem.setId("re");
		 mem.setPw("rere");
		
		 member.add(mem);
		 
		 //ArrayList에 먼저 담고 값을 입력하는 경우
		 
		 member.add(new Member());
		 
		 member.get(0).setId("re");
		 member.get(1).setPw("rere");
		
	}

}
