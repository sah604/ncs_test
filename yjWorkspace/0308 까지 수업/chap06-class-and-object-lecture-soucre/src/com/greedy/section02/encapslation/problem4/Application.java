package com.greedy.section02.encapslation.problem4;

public class Application {
	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		
		/*
		 * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
		 * public으로 접근을 허용한 메소드만 이용할 수 있도록 해놓은 것이다.
		 * --> 캡슐화(encapsulation)라고 한다.
		 * 
		 * */
		
		monster1.setKinds("프랑켄 슈터인 " );
		monster1.setHp(200);
		System.out.println(monster1.getInfo());
		
		/*
		 *캡슐화는 유지 보수성을 증가시키기 위해 필드의 접근을 제한하고
		 *public 메소드를 이용해서 간접젓으로 접슨하여 사용할 수 있도록 만든 기술이다.
		 *--> 클래스 작성시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용되고 있다. 
		 * */
		
	}
	

}
