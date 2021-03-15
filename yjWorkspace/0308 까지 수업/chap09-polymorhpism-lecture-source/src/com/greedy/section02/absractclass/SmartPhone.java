package com.greedy.section02.absractclass;

public class SmartPhone extends Product {
   
	/*
	 * Smartphone 클래스는 Product 클래스를 상속받아서 구현한다.
	 * extends키워드로 클래스를 상속 받았을때 두개 이상의 클래스는 상속하지 못한다. (모호성 제거)
	 * 추상클래스가 가지는 추상메소드를 반드시 오버라이딩 해야한다. (강제성 부여) */
	
	public SmartPhone() {}
	
	@Override
	public void abstMetod() {

		System.out.println("Product 클래스의 abstMethode를 오버라이딩 한 메소드 호출함...");
	}
	
	/* 추가적으로 메소드도 작성할 수 있다. */
	public void printSmartPhone() {
		System.out.println("스마트폰 클래스의 프린트스마트폰 메소드 호출함..");
	}

}
