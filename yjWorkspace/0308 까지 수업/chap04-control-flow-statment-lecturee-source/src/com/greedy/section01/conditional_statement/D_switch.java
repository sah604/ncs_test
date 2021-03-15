package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {
	
	/**
	 * <pre>
	 * switch문 실행 흐름을 확인 하기위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleSwithStatement() {
		
		/*
		 * [switch문 표현식]
		 * 
		 * switch(비교할 변수){
		 * 		case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 * 		case 비교값2 : 비교값2와 일칠하는 경우 실행할 구문; break;
		 * 		default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 * }
		 * 
		 * switch문으로 비교 가능한 값은 @@정수,문자,문자열 형태의 값@@  // 스위치 문에서는 문자열비교는 jdk 1.7 이상부터 가능하다
		 * 실수와 논리는 비교할 수 없다. 
		 * 
		 * 정확하게 일치하는 경우만 비교할 수 있으면, 대소비교를 할 수 없다.
		 * 
		 * 
		 */
		
		/*
		 * 정수 두 개와 연산 기호 문자를 입력 받아서
		 * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.println("연산 기호 입력 (+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
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
				result = first / second; // second의 값이 0인경우 에러발생 (ArithmeticExeption)
				break;
			case '%' : 
				result = first % second;
				break;
			// default문 생략 가능 -> 생략하는 경우에는 생략이유를 작성해주는 것이 좋다.
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * <pre>
	 * switch문으로 문자열 값 비교 테스트 및 break 테스트
	 * </pre>
	 */
	public void testSwitchVendingMachine() {
		/*
		 * swich문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		 * 1. jdk 1.7 이상 부터는 switch 문을 이용하여 문자열 비교 가능.
		 * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
		 *  
		 */
		
		/* switch문을 이용한 간단한 자판기 만들기 */
		System.out.println("===== greedy vending machine =====");
		System.out.println(" 사이다  환타  콜라  박카스  핫식스 ");		
		System.out.println("==================================");
		System.out.print("음료를 선택해 주세요 : ");		
		
		Scanner sc = new Scanner(System.in);
		String selectDrink = sc.nextLine();
		
		/* 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0;
		
		switch(selectDrink) {
			case "사이다" : 
				System.out.println("사이다를 선택하셨습니다.");
				price = 500;
			case "콜라" :
				System.out.println("콜라를 선택 하셨습니다,");
				price = 600;
			case "환타" : 
				System.out.println(" 환타 선택 하셨");
				price = 700;
			case "핫식스" :
				System.out.println(" 핫식수 선택 하셨");
				price = 10000;
			case "박카스" :
				System.out.println(" 박카스 선택");
				price = 2000;
		}
		
		System.out.println(price + "원을 투입해주세요 !");
		
		
		
		// 수정 후
		System.out.println("--------- 개선된 자판기 ----------");
		
		String order = "";
		
		switch(selectDrink) {
		    case "사이다" : 
		    	order = "사이다 ";
		    	price = 500;
		    	break; //현재 { } 사이를 나간다. 종료가 아님...
		    case "콜라" : 
		    	order = "콜라";
		    	price = 600;
		    	break;
		    case "환타" : 
		    	order = "환타";
		    	price = 1600;
		    	break;
		    case "박카스" : 
		    	order = "박카스";
		    	price = 2600;
		    	break;
		    case "핫식스" : 
		    	order = "핫식스";
		    	price = 3600;
		    	break;
		}
		
		System.out.println(order + "를 선택 하셨습니다.");
		System.out.println(price + "원을 투입해주세요 ! ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}
}
