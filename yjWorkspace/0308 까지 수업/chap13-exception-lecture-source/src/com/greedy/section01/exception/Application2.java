package com.greedy.section01.exception;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* try-catch를 이용한 방법(예외 발생하지 않음) */
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			/* 예외 발생 가능성이 있는 메소드는 try블럭 안에서 호출한다. */
			et.checkEnoughMoney(10000, 50000);
			
			System.out.println("======상품 구입가능=================");
		} catch (Exception e) {
			
			System.out.println("==== 상품 구입 불가=======");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
