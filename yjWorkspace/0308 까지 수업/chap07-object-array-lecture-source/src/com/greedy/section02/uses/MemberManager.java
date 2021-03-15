package com.greedy.section02.uses;

/**
 * 회원 관리의 기능을 제공하는 용도의 클래스
 * @author TJ
 *
 */
public class MemberManager {
	
	/**
	 * 여러명의 회원 정보를 등록
	 */
	public void signMember() {
		/* 5명의 회원 정보를 담을 객체 배열 생성 */
		MemberVO[] members = new MemberVO[5];
		
		members[0] = new MemberVO(1, "user01","pass01","홍길동",20,'남');
		members[1] = new MemberVO(2, "user021","pass021","유관순",220,'여');
		members[2] = new MemberVO(3, "user031","pass031","배트맨",30,'남');
		members[3] = new MemberVO(4, "user041","pass041","신사임당",50,'여');
		members[4] = new MemberVO(5, "user051","pass051","민연준",15,'남');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		
		memberInsertManager.insert(members);
	}

	/**
	 * 모든 회원 목록을 조회하여 정보를 출력
	 */
	public void printAllMembers() {
		
		MemberVO[] selectMembers = new MemberSelectManager().selectAllMembers();//@@@
		
		System.out.println("======= 가입된 회원 목록===========");
		for(MemberVO member : selectMembers) {
			System.out.println(member.getInfomation());
		}
		System.out.println("=========================");
		System.out.println("총 " + selectMembers.length + " 명이 가입했습니다");
	}
}
