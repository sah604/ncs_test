package com.greedy.section03.overring;

public class SubClass extends SuperClass {

	
	/*
	 * 	1. 메소드 이름 변경하면 에러 발생
	 * 	2. 메소드의 리턴 타입 변경하면 에러 발생
	 * 	3. 매개변수 갯수나 타입이 변경되면 에러발생
	 * 
	 * */
	@Override
	public void method(int num) {
		super.method(num);
	}

	
	/* private 메소드는 오버라이딩 불가 */
//	@Override
//	private void privateMethod() {}

	/* final 메소드 오버라이딩 불가 */
//	@Override
//	public final void finalMethod() {}
	
	
	
	
//	@Override
//	void protectedMethod() {} // (디폴트) 더 좁은 범위로 불가능
	
	
	@Override
	protected void protectedMethod() { //같은 범위로 가능
		super.protectedMethod();
	}
	
//	@Override
//	public void protectedMethod() {  // 더 넓은 범위로도 가능
//		super.protectedMethod();
//	}
	
	/* 클래스 선언부 에도 final 추가 할 수 있는데 final을 추가하면 상속자체가 안된다. */
	
	

}
