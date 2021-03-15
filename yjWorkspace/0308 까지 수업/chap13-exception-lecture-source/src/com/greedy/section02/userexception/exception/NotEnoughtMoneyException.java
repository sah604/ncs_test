package com.greedy.section02.userexception.exception;

public class NotEnoughtMoneyException extends Exception{
	
	/*
	 * 사용자 정의의 예외 클래스를 만들기 위해서는 Exception클래스를 상속 받으면 된다.
	 * */
	
	// 기본생성자
	public NotEnoughtMoneyException() {}
	
	// 문자열을 부모 생성자쪽으로 전달하여 초기화 하는 생성자
	public NotEnoughtMoneyException(String message) {
		
		// 예외 인스턴스 생성 시점에 전달한 예외 메세지를 부모 생성자 쪽으로 전달해서 인스턴스를 생성한다.
		super(message);
	}

}
