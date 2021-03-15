package com.greedy.section02.userexception;


import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughtMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application1 {
	
	public static void main(String[] args) {
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			// 상품가격보다 가진돈이 적은경우
//			et.checkEnoughMoney(50000, 3000);
			
			//상품가격을 음수로 입력한 경우
//			et.checkEnoughMoney(-50000, 30000);
			
			//가진돈이 음수
//			et.checkEnoughMoney(50000, -50000);
			
			et.checkEnoughMoney(30000, 500000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("가진돈이 충분합니다. 즐거운쇼핑");
		
		
		
		
		
		
		
	}

}
