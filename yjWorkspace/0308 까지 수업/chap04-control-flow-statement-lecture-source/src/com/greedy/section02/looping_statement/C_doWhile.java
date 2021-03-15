package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {
	
	/**
	 * <pre>
	 * 	단순 do-while문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleDoWhileStatement() {
		
		/* 반복문의 기본 흐름 테스트 */
		
		/*
		 * [do-while문 표현식]
		 * 
		 * 초기식;
		 * do {
		 *     1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우
		 *     수행할 구문(반복할 구문)
		 *     
		 *     증감식;
		 * } while(조건식);
		 * 
		 * */
		
		do {
			System.out.println("최초 한 번 동작한다.");
		} while(false); //거짓일때 종료하는구나 트루일때는 반복하구
		
		System.out.println("반복문 종료 확인..");
		
	}

	
	/**
	 * <pre>
	 *  do-while문 연습을 위한 예제
	 *  - 입력한 문자열을 반복적으로 출력한다.
	 *  단, exit이 입력되면 반복을 멈춘다.
	 * </pre>
	 */
	public void testDoWhileExample1() {
		
		Scanner sc = new Scanner(System.in);
		String str = "";					// TODO 선언 및 초기화
		
		do {
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println(str);
			
		// * equals() : 문자열은 == 비교가 불가능하다. 문자열이 같은지를 비교하는 기능 제공
		} while(str.equals("exit"));	// test가 exit -> false
				// 입력한 test가 exti와 같아요? answer: false
				// 반복을 계속 진행하기 위해서는 위의 결과값 false를 논리부정(!)을 해서
				// "exit" 입력되기 전까지 계속 반복시킨다.
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
	
}
