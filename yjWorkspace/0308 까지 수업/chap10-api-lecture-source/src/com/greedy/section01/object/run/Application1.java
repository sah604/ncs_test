package com.greedy.section01.object.run;

import com.greedy.section01.object1.book.vo.BookVO;

public class Application1 {
	
	public static void main(String[] args) {
		
		/*
		 * 모든 클래스는 Object 클래스의 후손이다.
		 * 오브젝트 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
		 * 부모 클래스가 가지는 메소드를 오버라이딩해서 사용 가능하다.
		 * 
		 * toString(), equals(), hashcode()
		 * */
		
		/* toString()의 오버라이딩을 확인 */
		
		BookVO book1 = new BookVO(1, "홍길동전", "허균", 50000);
		BookVO book2 = new BookVO(2, "목민심서", "정약용", 30000);
		BookVO book3 = new BookVO(2, "목민심서", "정약용", 30000);
		
		/* 동일한 값을 가지는 인스턴스도 다른 해쉬코드값을 가지고 있다. 
		 * 풀 클래스명 일과 @ 그리고 16진수 해쉬코드를 반환 
		 * */
		System.out.println("book1.toString() : " + book1); // toString = 주소값 반환
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		
		/* toString()을 오버라이드 해서 호출하지 않고 레퍼런스 변수만 출력하는 경우도 동일하게 결과가 나온다.
		 * --> 자동으로 toString()메소드를 호출해준다. */
		System.out.println("book1.toString() : " + book1); // toString = 주소값 반환
		System.out.println("book2.toString() : " + book2);
		System.out.println("book3.toString() : " + book3);
	}
	// -> 주소확인 보다 필드값을 확인하는 경우가 많기 때문에 
	//    toString 메소드를 오버라이딩 해서 필드값 확인용으로 많이 사용된다.

	
}
