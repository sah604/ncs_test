package com.greedy.section03.branching_statement;

public class B_continue {
	
	
	
	/**
	 * <pre>
	 * 	continue문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleContiuneStatement() {
		
		/*
		 * continue문은 반복문 내에서 사용한다.
		 * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
		 * 일반적으로 if(조건식) { continue; } 처럼 사용된다.
		 * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
		 * 
		 */
		
		/* 1부터 100사이의 4의 배수이면서 5의 배수인 값 출력 */
		for(int i = 1; i <100; i++) {
			
			if(i % 4 == 0 && i % 5 == 0) {
				
				System.out.println(i);
				
			} else {
				// 공배수가 아닌 경우 증감식으로 넘어간다.
				continue;
				
			}
			
		}
	}
	

	/**
	 * <pre>
	 * 	continue문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleContiuneStatement2() {
		
		// 구구단 2~9단까지 풀력
		// 단, 각 단의 수가 짝수인 경우 출력을 생략
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su <10; su++) {
				
				if(su % 2 == 0) {
					
					continue;	// su가 짝수인 경우 해당 회차 반복 내용을 건너뛰고 증감식으로 이동하세요.
								// 바로 증감식으로 올라감 (print를 안함)
				} 				// continue - 흐름을 제어하면서 "다시 돌린다." 개념
				
				System.out.println(dan + " * " + + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
		
	}
	
	
	/**
	 * <pre>
	 * 	한번에 모든 반복문의 반복회차를 건너뛰기
	 * </pre>
	 */
	public void testJumpContiune() {
		
		// 한번에 모든 반복문의 반복회차를 건너뛰기
		label:
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su <10; su++) {
				
				if(su % 2 == 0) {
					
					continue label;	
				
				}

				System.out.println(dan + " * " + su + " = " + (dan * su));
		
			}

			System.out.println();
			
		}
		
	}


}