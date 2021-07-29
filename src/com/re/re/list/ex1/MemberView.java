package com.re.re.list.ex1;

import java.util.HashMap;

public class MemberView {
	
	public void view() {
		//mypage 선택 시 실행
				//회원 id, pw, age 출력
				//단, 메서드의 head는 변경 금지
				//멤버변수 선언 x
		
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		
		System.out.println("id: "+memberDTO.getId());
		System.out.println("pw: "+memberDTO.getPw());
		System.out.println("age: "+memberDTO.getAge());
		
	}
	
	
	
}
