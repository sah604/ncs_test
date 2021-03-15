package com.greedy.section02.uses;

/**
 * 회원정보 조회를 담당하는 클래스
 * @author TJ
 *
 */
public class MemberSelectManager {

	public MemberVO[] selectAllMembers() {
		
		return new MemberVO[] {
				new MemberVO(1, "user01","pass01","g홍길동",20,'남')
				,new MemberVO(2, "user021","pass021","유관순",220,'여')
				,new MemberVO(3, "user031","pass031","배트맨",30,'남')
				,new MemberVO(4, "user041","pass041","신사임당",50,'여')
				,new MemberVO(5, "user051","pass051","민연준",15,'남')
				
		};
	}
}
