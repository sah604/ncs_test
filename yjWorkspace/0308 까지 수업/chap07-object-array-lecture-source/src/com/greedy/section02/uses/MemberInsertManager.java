package com.greedy.section02.uses;

/**
 * 회원 정보 등록에 대한 기능을 담당하는 클래스
 * @author TJ
 *
 */
public class MemberInsertManager {
	public void insert(MemberVO[] members) {
		System.out.println("회원을 등록합니다.");
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName() +" 님을 회원 등록에 성공하였씁니다");
		}
		System.out.println("총 "+ members.length + " 명의 회원등록에 성공햇습니다.");
	}
}
