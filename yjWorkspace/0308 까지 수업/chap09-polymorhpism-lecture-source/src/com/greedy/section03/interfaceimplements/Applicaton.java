package com.greedy.section03.interfaceimplements;

public class Applicaton {
	public static void main(String[] args) {
		/*
		 * 인터페이스(interface)
		 * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만 
		 * 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
		 * */
		
		/* 인터페이스의 사용목적
		 * 1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다.(표준화)
		 * 2. 자바의 단일상속의 단점을 극복할 수 있다.(다중상속)
		 * 
		 * 참고.
		 * 인터페이스는 정말 많은 의미로 사용된다.
		 * 지금 학습하는 인터페이스 말고도 클래스에 작성한 public method 또한
		 * 객체들이 상호작용을 하기 위한 통로의 의미로 인터페이스라고 불린다.
		 * */
		
		/* 인스턴스를 생성하지 못하고, 생성자 자체가 존재하지 않는다. */
//		InterProduct interProduct = new InterProduct(); // 에러발생
		
		/* 레퍼런스 타입으로만 사용가능하다. */
		InterProduct interProduct = new Product();
		
		/* 인터페이스의 추상 메소드 오버라이딩한 메소드로 동적 바인딩에 의해 호출된다. */
		interProduct.nonStaticMethod();
		interProduct.abstMethod();
		
		/*오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출되고, 
		 * Product클래스처럼 인터페이스의 default 메소드를 오버라이딩하면
		 * 오버라이딩된 메소드를 호출하게 된다.*/
		interProduct.defaultMethod();
		
		/* static 메소드는 인터페이스명.메소드명(); (태초에 있는곳) 으로 호출 */
		InterProduct.staticMethod();
		
		/* 상수 필드 접근도 인터페이스명.필드명 으로(태초에 있는곳) 접근한다.*/
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
	}
	


}
