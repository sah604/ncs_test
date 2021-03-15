package com.greedy.section01.method;

public class Application8 {
	public static void main(String[] args) {
		
		// static 메소드 호출 (예약어)
		// public과 void 사이에 static 이라는 키워드를 사용할 수 있다.
		
		// static 메소드를 호출하는 방법을 알아보자.
		// static이 붙은 메소드를 static 메소드라고 하며, 붙어있지 않는 메소드를 non-static 메소드라고 한다.
		// --> static 이나 non-static 메소드건 동작흐름은 다르지 않다.
		
		// static 메소드를 호출해보자
		// static 메소드를 호출하는 방법
		// 클래스명.메소드명(); <- 이런 방식으로 호출한다.
		
		System.out.println("10과 20의 합 : " + Application8.sumTwoNumber(10, 20));
		
		// 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능 하다.
		System.out.println("20과 30의 합 : " + sumTwoNumber(20, 30));
	}
	// 컨트롤 h 검색 
	public static int sumTwoNumber(int first, int second) {
		return first + second;
	}
	
}
