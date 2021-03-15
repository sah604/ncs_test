package com.greedy.section02.encapslation.problem3;

public class Application {
	public static void main(String[] args) {
		
		/* 필드에 직접 접근하지 않고 메소드를 이용하여 간접 접근 하도록
		 * */
		
		/* 몬스터 객체 여러개 생성*/
		Monster monster1 = new Monster();
		monster1.setInfo(" 드라큘라 ");
		monster1.setHp(100);
		
		Monster monster2 = new Monster();
		monster2.setInfo(" 프랑켄 ");
		monster2.setHp(200);
		
		Monster monster3 = new Monster();
		monster3.setInfo(" 늑머인간 ");
		monster3.setHp(300);
		
		System.out.println(monster1.getInfo());
		System.out.println(monster2.getInfo());
		System.out.println(monster3.getInfo());
		
		// monster4 hp = -500 을 해도 직접접근 가능하다. 그래서 우찌해야하나.
		
	}
	

}
