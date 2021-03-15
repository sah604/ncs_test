package com.greedy.section03.increment_decrement_operator;

public class Application1 {

	public static void main(String[] args) {
		
		// 증감연산자
		// 피연산자의 앞 or 뒤에 사용이 가능하다.
		/*
		 * '++' : 1 증가의 의미
		 * '--' : 1 감소의 의미 
		 */
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;   // 1 증가 20(21)
		System.out.println("num : " + num);
		
		++num;   // 1 증가 22(22)
		System.out.println("num : " + num);
		
		num--;  // 1 감소 22(21)
		System.out.println("num : " + num);
		
		--num;  // 1 감소 20(20)
		System.out.println("num : " + num);
		
		int firstNum = 20;
		
		int result1 = firstNum++ * 3;
		            //   20(21)
		System.out.println("result1 : " + result1);
		System.out.println("firstNum : " + firstNum);
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		System.out.println("result2 : " + result2);
		System.out.println("secondNum : " + secondNum);
		
	} 

}
















