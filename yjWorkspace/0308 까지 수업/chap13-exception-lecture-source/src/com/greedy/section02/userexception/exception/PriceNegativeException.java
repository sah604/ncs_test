package com.greedy.section02.userexception.exception;

public class PriceNegativeException extends NegativeException{
	
	// 상품가격이 음수인 경우 발생하는 예외
	
	public PriceNegativeException() {}
	
	public PriceNegativeException(String message) {
		
		super(message);
	}

}
