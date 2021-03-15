package com.greedy.section02.encapslation.problem1;

public class Appliction {
	
	public static void main(String[] args) {
		
		
		/* 필드에 바로 접근 할 때 발생할 수 있는 문제점 */
		/*
		 * 필드에 올바르지 않는 값이 들어가도 통제가 불가능 해진다.
		 * 
		 * 
		 * 
		 * */
		
		/* 1번 몬스터 생성 */
		
		Monster monster1 = new Monster();
		
		/* 몬스터의 이름과 체력 변경 */
		monster1.name = "두치";
		monster1.hp = 200;
		
		/* 몬스터 정보 출력 */
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);
		
		/* 2번 몬스터 생성 */
		Monster monster2 = new Monster();
		
		/* 몬스터의 이름과 체력 변경*/
		monster2.name = "뿌꾸";
		monster2.hp  = -200;
		System.out.println("monster1 name : " + monster2.name);
		System.out.println("monster1 hp : " + monster2.hp);
		
		/* 3번 몬스터 생성 */
		Monster monster3 = new Monster();
		monster3.name = "드라큘라";
		monster3.setHp(200);
		System.out.println("monster1 name : " + monster3.name);
		System.out.println("monster1 hp : " + monster3.hp);
		
		/* 음수입력을 제한하는지 확인하도록 4번 몬스터 한마리 더 생성*/
		Monster monster4 = new Monster();
		monster4.name = "드라큘라";
		monster4.setHp(-1000);
		System.out.println("monster1 name : " + monster4.name);
		System.out.println("monster1 hp : " + monster4.hp);
		
	}

}
