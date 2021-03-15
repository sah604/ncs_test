package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {	// naming 방식에서는 문제가 있으나 순서대로 보기 위해 허용
	

	/**
	 *<pre>
	 *  단독 if문 실행 흐름을 판단하기 위한 용도의 기능을 제공
	 *  정수 짝수 여부 판단 확인용
	 * </pre>
	 */
	public void testSimpleIfStatement() {
		/*
		 * [if문 표현식]
		 * if(조건식) {
		 * 		조건식이 true일 때 실행할 명령문;
		 * }
		 * 
		 * 
		 * 조건식 : true or false가 나오는 연산식
		 * 
		 * if문은 조건식의 결과 값이 참(true)이면 {} 안에 있는 코드를 실행하고,
		 * 조건식의 결과 값이 거짓(false)이면 {} 안에 있는 코드를 무시하고 넘어간다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개를 입력하세요. : ");
		int num = sc.nextInt();
		
		// 짝수, 홀수를 구분하는 구문
		if(num % 2 == 0) {	//	debug모드 expression에서 미리 확인 가능
			
			System.out.println("입력하신 숫자는 짝수입니다.");
		
		} else {
			
			System.out.println("입력하신 숫자는 홀수 입니다.");
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		sc.close();
		
	}
		
	
	
	
	/**
	 * <pre>
	 * 	중첩 if 구문 흐름을 확인하기 위한 용도 메소드.
	 * 	양의 정수 짝수인지 여부 판단 확인
	 * </pre>
	 * 
	 */
	public void testNestedIfStatement() {
		
		// 중첩된 if문 실행 흐름 확인
		// if문 안에서 또 다른 조건을 사용하여 if문을 사용할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 정수 한 개를 입력 받아. 그 수가 양수인 경우에만. 짝수인지 확인하여.
		 * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력
		 * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문
		 *  
		 */
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();	//	정수 한 개 입력 받기 완료
		
		// 양수인지 조건 확인
		if(num > 0) {	//	참이면 짝수인지 여부를 확인하러 가자
			
			//	양수가 맞으면 다시 한 번 짝수인지 확인
			if(num % 2 == 0) {	// TODO == 구문 다시 공부
				
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
				
				}
			
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
		sc.close();
		
		// 코드를 작성 할 때 한 번에 위에서 아래로 쭉 작성하는 것이 아니라
		// 하나씩 작성하면서 살을 붙이기
						
	}
	
	
}


