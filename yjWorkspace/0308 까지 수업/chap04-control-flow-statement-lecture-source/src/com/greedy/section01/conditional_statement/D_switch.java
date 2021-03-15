package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {

	/**
	 * <pre>
	 * switch문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	/**
	 * 
	 */
	public void testSimpleSwtichStatement() {
		
		/* TODO 공부공부
		 * 
		 * [switch문 표현식]
		 * 
		 * switch(비교할 변수) {
		 * 		case 비교값1 : 비교값1과 일치하는 경우 실행할 구문;break;
		 * 		case 비교값2 : 비교값2와 일치하는 경우 실행할 구문;break;
		 * 		default : case에 모두 해당하지 않는 경우 실행할 구문;break;
		 * }
		 * 
		 * swtich문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값
		 * 시수와 논리는 비교할 수 없다.
		 * 
		 * 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할 수 없다.
		 * (정수, 문자, 문자열 -> 실수와 대소비교는 XXXXXXX)
		 * 
		 * swtich문에서 문자열 비교는 jdk 1.7이상 버전부터 가능하다.
		 * (현재 공부용 버전은 1.8, 회사에서는 그 이하 버전이 많음)
		 * 
		 * **TODO !! break는 {} 밖으로 나가는 기능이다 !!
		 * 
		 */
		
		
		/*
		 *  정수 두개와 연산 기호 문자를 입력 받아서
		 *  두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0); // TODO 기호 받는 부분 next().chatAt(); 공부. 왜 0이 들어가?
		
		// 연산의 결과를 저장할 변수
		int result = 0;
		
		switch(op) {
			case '+' : 
				result = first + second;
				break;
			case '-' :
				result = first - second;
					break;
			case '*' :
				result = first * second;
				break;
			case '/' :
				result = first / second; // second 값이 0인 경우 에러 발생 (ArithmeticException)
				break;
			case '%' :
				result = first % second;
				break;
			// TODO default문은 생략이 가능하다. -> 생략하는 경우 생략에 대한 이유를 작성해주는 것이 좋다.
		
		}
		
		System.out.print(first + " " + op + " " + second +  " = " + result);
		
		sc.close();
		
				
	}
	
	
	
	/**
	 * <pre>
	 *  switch문으로 문자열 값 비교 테스트 및 break 테스트
	 * </pre>
	 */
	public void testSwitchVendingMachine() {
		
		/*
		 * switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		 * 1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
		 * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
		 */
		
		/* swtich 문을 이용한 간단한 자판기 */
		System.out.println("====== greedy vending machine =======");
		System.out.println("  사이다   콜라   환타   바카스   학식스   ");
		System.out.println("======================================");
		System.out.print("음료를 선택해 주세요. : ");

		Scanner sc = new Scanner(System.in);
		String selectDrink = sc.nextLine();
		
		/* 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0;
		
		switch(selectDrink) {
			case "사이다" :
				System.out.println("사이다를 선택하셨습니다.");
				price = 500;	//	break가 없어서 해당 case가 끝나면 바로 다음 case를 실행함
			case "콜라" :
				System.out.println("콜라를 선택하셨습니다.");
				price = 600;
			case "환타" :
				System.out.println("환타를 선택하셨습니다.");
				price = 700;
			case "바카스" :
				System.out.println("바카스를 선택하셨습니다.");
				price = 2000;				
			case "핫식스" :
				System.out.println("바카스를 선택하셨습니다.");
				price = 10000;
//			default : 
//				System.out.println("목록에 없는 값을 입력하셨습니다.");
				// 목록에 없는 것에 대해 언급
				
		}
		
		System.out.println(price + "원을 투입해주세요.");
		
		
		
		// 수정 후 (위 자판기는 syso를 너무 남발)
		System.out.println("------------ 개선된 자판기 ------------");
		
		String order = "";	//	TODO 왜 order만 선언함? price는? 위에 있어서?
		
		switch(selectDrink) {
			case "사이다" :
				order = "사이다";
				price = 500;
				break;
			case "콜라" :
				order = "사이다";
				price = 600;
				break;				
			case "환타" :
				order = "환타";
				price = 700;
				break;				
			case "바카스" :
				order = "바카스";
				price = 2000;
				break;				
			case "핫식스" :
				order = "사이다";
				price = 10000;
				break;				
		
		}
		
		System.out.println(order + "를 선택하셨습니다.");
		System.out.println(price + "원을 투입해주세요.");
		
		sc.close();
	}
	
	
	
	
}
