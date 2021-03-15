package com.greedy.section06.singleton;

public class LazySingleton {
	
	/* 클래스가 초기화 되는 시점에서 정적(static) 필드를 선언해 주고 null로 초기화 한다. */
	private static LazySingleton lazy; //레이지란 필드변수 선언 을 스테틱으로 선언해서 스테틱 저장 공간에 저장
	// lazy 의 자료형은? 
	// 인스턴스 임.
	// 
	public LazySingleton lazy1; //인스턴스도 변수로 쓸수 있다. 대박인데?
	
	
	/* 싱글톤 패턴을 생성자 호출을 통해 외부에서 인스턴스를 생성하는것을 제한한다. */
	private LazySingleton() {}
	
	public static LazySingleton getInstance() { // 레이지싱글톤의 겟인스턴트라는 메소드
		/*
		 * 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
		 * 생성한 인스턴스가 있는 경우 만들어둔 인스턴스를 반환한다.
		 * */
		if(lazy == null) { // 인스턴스 의 자료형 은 null이다. 그리고 인스턴스의 값은  null 과 null아닌값(new 생성자로 인스턴스 생성시) 만 존재한다.
			lazy = new LazySingleton();
		}
		return lazy;
	}

}
