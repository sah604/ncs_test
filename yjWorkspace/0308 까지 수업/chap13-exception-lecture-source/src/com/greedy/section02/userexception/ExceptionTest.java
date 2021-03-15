package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughtMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money) 
//			throws PriceNegativeException, MoneyNegativeException, NotEnoughtMoneyException {
			throws Exception{
		// 먼저 상품 가경이 음수인지 확인하고 음수인 경우 예외를 발생
		if(price < 0) {
			
			throw new PriceNegativeException("상품 가격이 음수일 수 없습니다.");
		}
		
		// 가진 돈도 음수인지 확인하고 음수인 경우에는 예외 발생
		if(money < 0) {
			
			throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
		}
		
		// 위으 두 값이 정상입력 되었더라도 상품 가격이 가진 돈보다 큰 경우 예외 발생
		if(money < price) {
			
			throw new NotEnoughtMoneyException("가진 돈 보다 상품가격이 더 비쌉니다.");
		}
		
		System.err.println("가진 돈이 충분합니다 즐쇼~");
		
	}

}
