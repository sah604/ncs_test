package com.greedy.section01.exception;

public class Application {
	public static void main(String[] args) throws Exception {
		
		/*
		 * 예외처리
		 * 
		 * 자바 프로그램 작성 시 자바 문법에 맞지 않는 경우
		 * 코드를 컴파일 하려고 할 때 컴파일 에러를 발생 시킨다. 엄밀히 말하면 문법상의 오류(Syntax Error)이다.
		 * 혹은 자바 문법에 맞게 작성하여 컴파일에 문제가 없더라도, 실행되면서 예상치 못하게 오류가 발생할 수 있다.
		 * 
		 * 오류(Error)
		 * 시스템 상에서 프로그램에 심각한 문제가 발생하여 실행중인 프로그램이 종료 하는것
		 * 
		 * 예외(Exception)
		 * 오류와 마찬가지로 실행중인 프로그램을 비정상적인 종료이지만
		 * 발생할 수 있는 상황을 미리 예측하고 처리할 수 있는 미약한 오류를 말한다.
		 * */
		
		/*
		 * 예외처리방법
		 * 
		 * 1. throws로 위임
		 * 2. try-catch로 처리
		 * */
		
		// 강제로 예외를 발생
		// throw new 예외 클래스명();
		
		ExceptionTest et = new ExceptionTest();
		
		// 상품가격은 만원이고, 가진돈은 5만원인 경우
		et.checkEnoughMoney(10000,50000); // 정상 동작 한다.
		
		// 상품가격이 오만원, 가진돈은 만원인 경우
		et.checkEnoughMoney(50000, 10000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
