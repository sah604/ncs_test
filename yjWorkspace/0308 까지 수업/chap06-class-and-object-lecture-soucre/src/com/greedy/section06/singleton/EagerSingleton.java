package com.greedy.section06.singleton;

public class EagerSingleton { //public 이자나;;;
	
	/* 클래스가 초기화 되는 시점에서 인스턴스를 생성한다. */
	private static EagerSingleton eager = new EagerSingleton();  //스테틱 상에 eager 존재
	/* 그래서 여기는 어디선가는 new 생성자 를 통해 주소값을 만들어 줘야 하는데 위에서 먼저 만들어준것  = 이른   아래서 if문으로 만들어 준것  = 게으른*/
	
	
	/* 싱글톤 패턴은 생성자 호출을 통해서 외분에서 인스턴스를 생성하는 것을 제한한다. */
	private EagerSingleton() {}  //프라이빗을 통해 생성자를 막음
	// 기본 생성자 접근만 막아도 매개변수를 작성해서 접근 하는것 조차 안되게 막아버림.
	
	/* public 인터페이스로 인스턴스를 반환하도록 한다.*/
	public static EagerSingleton getInstance() {
		return eager;
	}
	
	// 여기에 접근가능한 이유 =  public class EagerSingleton 여기는 접근 가능함. 근데 프라이빗 선언한 객체선언 / 생성자 호출 을 다른 클래스에서 호출 못하게 막아버림
	public static void  gt() {
		// 
		System.out.println("호출성공");
	}
	// 접근을
	
}
