package com.re.re.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAO {
	
	private String info;
	private Scanner sc;
	
	public MemberDAO() {
		info = "iu, pw1, 28, ae, pw2 , 20, wb, pw3, 24";
		sc = new Scanner(System.in);
	}
	
	
	//memberLogin
		//Scanner로 id,pw만 입력받기 MemberDTO 멤버변수로 넣기
		//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘 다 일치하는 것을 찾아서 해당 DTO리턴
	
	public MemberDTO memberLogin(ArrayList<MemberDTO> member) {
		MemberDTO memberDTO = new MemberDTO();
		MemberDTO result = null;
		
		System.out.println("id>>");
		String id = sc.next();
		System.out.println("pw>>");
		String pw = sc.next();
		
		for(int i=0; i<member.size(); i++) {
			member.get(i).getId();
			member.get(i).getPw();
			if(id.equals(member.get(i).getId()) && pw.equals(member.get(i).getPw())) {
				result = member.get(i);
				break;
			}
		}
		
		return result;
		
	}
	
	//memberDelete
		//Scanner로 id,pw만 입력받기 MemberDTO 멤버변수로 넣기
		//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘 다 일치하는 것을 찾아서 삭제
	
	public int memberDelete(ArrayList<MemberDTO> member) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id");
		String id = sc.next();
		System.out.println("pw");
		String pw = sc.next();
		int result =0;
		for(int i=0; i<member.size(); i++) {
			member.get(i).getId();
			member.get(i).getPw();
			if(id.equals(member.get(i).getId())&& pw.equals(member.get(i).getPw())) {
				member.remove(i);
				result =1;
				break;
			}
			
		}
		return result;
		
	}
	
	
	
	//memberAdd
		//scanner로 id, pw, age 입력받아서 MemberDTO 멤버변수로 넣기
		//매개변수로 ArrayList를 받아서 작성한 MemberDTO를 추가하기
		public void memberAdd(ArrayList<MemberDTO> member) {
			MemberDTO memberDTO = new MemberDTO();
			System.out.println("id>>");
			memberDTO.setId(sc.next());
			System.out.println("pw>>");
			memberDTO.setPw(sc.next());
			System.out.println("age>>");
			memberDTO.setAge(sc.nextInt());
			
			member.add(memberDTO);
			
		}
	
	
	
	
	
	
	//멤버메서드 - memeberInit 
		// info에 있는 정보를 파싱해서 memberDTO 객체 생성해서 대입
		//ArrayList에 각각 추가하고 리턴
	
	
	public ArrayList<MemberDTO> memberInit() {
		String [] str = info.split(",");
		ArrayList<MemberDTO> member = new ArrayList<>();
		for(int i=0; i<str.length; i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(str[i].trim());
			memberDTO.setPw(str[++i].trim());
			memberDTO.setAge(Integer.parseInt(str[++i].trim()));
			member.add(memberDTO);
		}
//		for(int i=0; i<member.size(); i++) {
//		System.out.println(member.get(i).getId());
//		System.out.println(member.get(i).getPw());
//		System.out.println(member.get(i).getAge());
//		System.out.println("---------------------------");
//	}
		
		return member;
	} 
	
	
	
	
	
}
