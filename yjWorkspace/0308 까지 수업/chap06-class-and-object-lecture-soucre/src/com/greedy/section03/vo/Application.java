package com.greedy.section03.vo;

public class Application {
	
	/*
	 * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 값 객체/****(value Object)***
	 * 값 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙은 준수한다.
	 * 
	 * 모든 필드는 private로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
	 * private 필드와 필드값을 수정하는 설정자(setter) , 
	 * private 필드에 접근하는 접근자 (getter)들로 구성된다. 
	 * 
	 * */
	public static void main(String[] args) {
		
		Member member = new Member();
		member.setNumber(1);
		member.setName("홍길동");
		member.setAge(20);
		member.setGenger('남');
		member.setHeight(180.9);
		member.setWeight(75.6);
		member.setActivated(true);
		
		System.out.println("회원 번호 : " + member.getNumber());
		System.out.println("회원 명 : " + member.getName());
		System.out.println("회원 나이 : " + member.getAge());
		System.out.println("회원 성별 : " + member.getGender());
		System.out.println("회원 몸무게 : " + member.getWeight());
		System.out.println("회원 키 : " + member.getHeight());
		System.out.println("회원 활성화 상태 : " + member.isActivated());
	}

	
}
