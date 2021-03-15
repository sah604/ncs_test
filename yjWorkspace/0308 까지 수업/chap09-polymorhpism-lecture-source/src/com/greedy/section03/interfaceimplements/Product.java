package com.greedy.section03.interfaceimplements;

public class Product extends java.lang.Object implements InterProduct, java.io.Serializable{  //상속과 달리 여러개의 인터페이스를 임프리먼츠 가능

	
	/* 클래스에서 인터페이스를 상속 받을 때 에는 implements 키워드를 사용한다.
	 * 또한 인터페이스는 여러개를 상속 받을수 있으며,
	 * extends로 다른 클래스를 상속받는 경우에도 그것고 별개로 인터페이스 추가 상속이 가능해진다.
	 * 
	 * 단, extends 키워드를 앞에 작성하고  implements를 뒤에 작성한다.
	 * */
	
	/*
	 * InterProduct를 상속 받으면 오버라이딩 해야 하는 메소드의 강제성이 부여되기 떄문에
	 * 인터페이스에 작성한 추상 메소드를 전부 오버라이딩 해야 한다. */
	
	@Override
	public int compare(Object arg0, Object arg1) {
		return 0;
	}

	@Override
	public void nonStaticMethod() {
		
		System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출함...");
		
	}


	@Override
	public void abstMethod() {
		System.out.println("InterProduct의 abstMethod 오버라딩한 메소드 호출됨...");
	}
	
	/* defaul메소드는 인터페이스에서만 작성 가능 */ // 여기서 부턴 버전에 따라 참고적으로 확인.
	
	/* default 키워드를 제외하면 오버라이딩 가능 */
	@Override
	public void defaultMethod() {

		System.out.println("Product 클래스의 defaultMethod 호출됨..");
	}
	
	/*  static메소드는 오버라이딩 할 수 없다. */
//	@Override
//	public static void staticMethod() {}

}
