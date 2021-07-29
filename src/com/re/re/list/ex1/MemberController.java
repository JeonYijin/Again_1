package com.re.re.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	private MemberView memberView;
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit();
		memberView = new MemberView();
	}
	
	public void start() {
		//1. 회원 가입
		//2. 로그인
		//3. 종료
		//초기화 init 

		boolean check = true;
	
		while(check) {
			if(MemberSession.SESSION.get("member") != null) {
				//로그인 성공시
				afterLogin();
			}else {
				//로그인 실패시
				check = beforeLogin();
				
			}

		
		}
	}
	
	public void afterLogin() {
		System.out.println("1. 마이페이지");
		System.out.println("2. 로그아웃");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("자기 정보 출력");
			memberView.view();
		}else {
			//member를 null이 되게 하는 방법
			MemberSession.SESSION.remove("member");
			System.out.println("로그아웃");
			
		}
		
	}
	
	
	public boolean beforeLogin() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("번호 입력");
		
		boolean flag = true;
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1. 회원가입");
			memberDAO.memberAdd(ar);
			break;
		case 2:
			System.out.println("2. 로그인");
			MemberDTO memberDTO = memberDAO.memberLogin(ar);
			if(memberDTO !=null) {
				MemberSession.SESSION.put("member", memberDTO);
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		default:
			System.out.println("3. 종료");
			flag = false;
			
		}
		return flag;
	}
	
	
	
}
