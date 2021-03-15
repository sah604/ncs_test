package com.greedy.section03.branching_statement;

public class A_break {
	
	/**
	 * <pre>
	 *  break문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleBreakStatement() {
		
		/*
		 * break문은 반복문 내에서 사용한다. 단, switch문은 반복문은 아니지만 예외적으로 사용된다.
		 * -> 해당 반복문을 빠져 나올때 사용하며, 반복문의 조건문 판단 여부와 상관없이 반복문을
		 *    빠져나올때 사용한다.
		 * 
		 * 일반적으로 if(조건식) { break; } 처럼 사용된다.
		 */
		
		/* break문을 이용하여 무한루프를 활용한 1~100까지 합계 구하기 */
		
		int sum = 0;
		int i = 1;
		
		while(true) {	//	조건식이 true면 반복하는데, 아예 조건식 대신 true를 넣어버림
			
			sum += i;
			
			// 반복문 조건과 별개로 반복문을 빠져나오기 위한 조건 다시 작성
			if(i == 100) {
				
				break;
				
			}
			
			i++;
			
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "이다.");
		
		
		
		System.out.println("==================================");
		
		int sum2 = 0;
		
		
		for(int i3 = 1; ; i3++) {	// TODO 모든 자리를 비워둬도 됨 -> 조건식을 제외하여 무한루프 만들기!!
									//	단, 무한루프는 보통 while문을 쓴다.
			sum2 += i3;
			
			if(i3 == 100) {
				
				break;	// TODO 현재 반복문 나가기 // return; 메소드 빠져나가기
				
			}
			
		}
		
	}
	
	
	/**
	 * <pre>
	 * 	break문 실행 흐름을 확인하기 위해 용도의 기능을 제공
	 * 	중첩 반복문 내에서 분기문(break)의 기본 흐름에 대해 테스트
	 * </pre>
	 */
	public void testSimpleBreakStatement2() {
		
		/* 중첩 반복문 내에서 분기문의 흐름 */ //TODO break와 return의 차이점 알기
		/* break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다. */
		
		// 구구단 2~9단까지 출력
		// -> 각 단의 수가 5보다 큰 경우는 출력을 생략한다.
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su <10; su++) {
			
				if(su > 5) {
					
					break;
					
				}
				
			System.out.println(dan + " * " + su + " = " + (dan * su));
			
			}
			
		}
		
		System.out.println();
		
	}
	
	
	
	/**
	 * <pre>
	 * 	break문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 	중첩 반복문 내에서 분기문(break)를 이용하여 한 번에 여러개 반복문 중지시키기
	 * </pre>
	 */
	public void testJumpBreak() {
		
		label:
		for(;;) {
			for(int i = 0; i < 10; i++) {
				
				System.out.println(i);
				
				if(i == 3) {
					
					break label;	//	TODO break는 해당 반복문만 나가는데
									//	label(다른 이름 OK)을 걸어 모든 반복문 밖으로 나갈 수 있게 함
				}
				
			}
				
		}
		
	}
	
	
}
