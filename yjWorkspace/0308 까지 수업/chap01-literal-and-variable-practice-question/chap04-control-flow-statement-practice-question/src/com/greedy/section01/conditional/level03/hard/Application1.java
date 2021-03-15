package com.greedy.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 두 개의 정수를 입력 받아 변수에 저장하고,
		 * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
		 * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 --
		 * 첫 번째 정수 : 4
		 * 두 번쨰 정수 : 3
		 * 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 --
		 * 4 + 3 = 7 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		double num1 = sc.nextDouble();
		
		System.out.print(" 두 번째 정수 입력 : ");
		double num2 = sc.nextDouble();
		
		double result = 0;
		
		System.out.print("연산기호(+, -, *, /, %) 입력 : ");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' : 
			result = num1 - num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		default :
				System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
		//@@@@@@@ return;  이 때의 리턴은 외부로 나가게 된다 . main 메소드 종료가 돼서 아래 부분 실행 안댐.
		
		}
		
		/*추가 */ if (ch == '+' || ch =='-' || ch == '/' || ch == '%' || ch =='*')
		System.out.println(num1 + " " + ch+ " " + num2 +" = "+ result);
		// 문자열 없이 연산 하게 되면 연산식으로 계산되어 오류발생가능... 하지만 문자열을 포함하면 문자열 연산식으로 인식.,..
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
