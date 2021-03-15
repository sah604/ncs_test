package com.greedy.section02.userexception.exception;

public class MoneyNegativeException extends NegativeException {
	
	//가진 돈이 음수인 경우 발생하는 예외를 정의
	public MoneyNegativeException() {}
	
	public MoneyNegativeException(String message) {
		
		super(message);
	}

}
