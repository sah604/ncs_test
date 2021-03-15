package com.greedy.section02.encapslation.problem1;

public class Monster {
	
	/* 필드로 몬스터 이름과 체력을 저장할 공간을 선언 */
	
	String name; // 몬스터 이름
	int hp;      // 몬스터 체력
	
	/*
	 * hp에 음수가 저장되는것을 방지하고 hp가 양수인 경우에만 입력하는  hp로 변경하고,
	 * 0보다 작은 경우 0으로 변경할 수 있도록 작성하자.
	 * 
	 * */
	
	public void setHp(int hp) {
		
		if (hp > 0) {
			// 지역변수와 전역변수가 이름이 동일할 경우 지역변수 우선적으로 접근 //
			/* 전역변수에 접근하기 위해서 this. 을 명시해야 한다.
			// this는 인스턴스가 생성되었을때 자신의 주소를 저장하는 레퍼런스 변수이다. */
			System.out.println("양수 값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			this.hp = hp;
		}else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
			this.hp = 0;
		}
	}

}
