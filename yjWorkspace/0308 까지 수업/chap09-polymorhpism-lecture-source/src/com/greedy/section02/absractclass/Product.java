package com.greedy.section02.absractclass;

public abstract class Product {
	
	/* 추상클래스는 필드를 가질 수 있다. */
	private int nonStaticField;
	private static int staticField;
	
	/* 추상 클래스는 생성자도 가질수 있다.
	 * 다만 직접적으로 인스턴스를 생성할수는 없다.*/ // 매개변수 생성자도>?
	public Product() {}
	public Product(int nonStaticField) {}
	
	/* 추상 클래스는 일반적인 메소드를 가질수 있다.*/
	public void nonStaticMethod() {
		System.out.println("Pro덕트 클래스의 논스태틱메소드 호출함");
	}
	
	public static void staticMethod() {
		System.out.println("Pro덕트 클래스의 스태틱메소드 호출함");
	}
	
	/*미완성 메소드 (추상 메소드) 또한 만들 수 있다.
	 * 추상메소드가 0개인경우 선택적으로 클래스에 abstract 키워드를 작성해야 한다. */
	public abstract void abstMetod(); // 추상 메소드가 하나라도 있으면 추상 클래스로 생성.
	// 추상 클래스는 추상 메소드
}
