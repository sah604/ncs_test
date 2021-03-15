package com.greedy.section01.generic;

public class GenericTest<T> { // T = type 이란 뜻 으로 통상 쓰인다.

	
	/*
	 * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성
	 * <> 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
	 * 
	 *  T는 타입변수라고 부른다.
	 *  타입변수는 자료형 대신 사용할 것이고 가상으로 존재하는 타입
	 *  또한 여러개의 타입 변수를 작성할 때는 , 를 이용해서 여러개 기술 할 수도 있다.
	 * */
	
	/* 현재 해당 필드는 타입이 결정되지 않은 상태이다. */
	private T value;

	/* setter/getter 작성 시에도 구체적인 타입 대신 T를 이용할 수 있다. */
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
