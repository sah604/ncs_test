package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class B_ifElse {

	// TODO *** 삼항연산자로 만든 코드는 if-else 구문으로도 변경이 가능하다.
	
	/**
	 * <pre>
	 * 	단독 if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 	정수 홀수 짝수 판별용 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {

		/*
		 * 
		 * [if-else문 표현식]
		 * if(조건식) {
		 * 		조건식이 true일 때 실행할 명령문;
		 * } else {
		 * 		조건식이 false일 때 실행할 명령문;
		 * }
		 * 
		 * if문은 조건식의 결과값이 참(true)이면 if {}안에 있는 코드를 실행하고,
		 * 조건식의 결과값이 거짓(false)이면 else {} 안에 있는 코드를 실행한다.
		 * 
		 * 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야 하는 경우 많이 사용된다.
		 * 
		 */
		
		/*
		 * 정수 한 개를 입력받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."
		 * 라고 출력하고, 홀수가 아니면 "입력하신 숫자는 짝수 입니다."리고
		 * 출력하는 프로그램을 작성해보자
		 * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램이 종료됩니다."
		 * 라고 출력해보자
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 != 0 ) {
			
			System.out.println("입력하신 숫자는 홀수입니다.");
						
		} else {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
		}
	
	
	
	
	
	/**
	 * <pre>
	 * 	중첩 if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 	정수 양수 or 음수 or 0 중 한가지 인지 판별용 기능 제공
	 * </pre>
	 */
	public void testNestedIfElseStatmement() {
		
		/* 충첩된 if-else문 실행 흐름 확인 */
		/* if-else문 안에서 또 다른 조건을 사용하여 if-else문을 사용할 수 있다.*/
		
		/*
		 * 숫자를 하나 입력받아서 양수이면 "입력하신 숫자는 양수입니다."를 출력하고,
		 * 음수이면 "입력하신 숫자는 음수입니다."를 출력
		 * 단, 0이면 "0입니다." 라고 출력하세요
		 * 조건과 상관없이 프로그램이 종료될 때 "프로그램이 종료합니다."
		 * 라고 출력되도록 한다.
		 * 
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력해주세요. : ");
		int num = sc.nextInt();	//	정수값을 받아준다.
								//	nextInt()는 입력값을 int 형태로 받겠다.
		
		if(num != 0) {
			
			if(num > 0) {
				
				System.out.println("입력하신 숫자는 양수입니다.");
			
			} else {
			
				System.out.println("입력하신 숫자는 음수입니다.");
				
			}
			
		} else {
			
			System.out.println("입력하신 숫자는 0 입니다.");
			
		}
	
			System.out.println("프로그램을 종료합니다.");

			sc.close();
						
		}
	
	
	}
	

