package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class B_while {
	
	
	/**
	 * <pre>
	 * 	단순 while문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleWhileStatement() {
		
		/*
		 * [while문 표현식]
		 * 초기식;
		 * while(조건식) {
		 *     조건을 만족하는 경우 수행할 구문(반복할 구문);
		 *     증감식;
		 * }
		 * 
		 */
		
		// 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
	}
	
	
	/**
	 * while문 연습
	 * - 입력한 문자열을 한 문자씩 출력해보기
	 */
	public void testWhileExample1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : "); // 입력할때 print로!!!!
		String str = sc.nextLine();
		
		/* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능 */
		/* length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다. */
		// index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
		// 존재하지 않는 인덱스에 접근하려고 하면 StringIndexOutOfBoundsException 이 발생한다.
		
		System.out.println("========== for문 ==========");
		for(int i = 0; i < str.length(); i++) {	// TODO i를 0부터 시작하는 이유는 index가 0부터 시작하기 때문에
			
			char ch = str.charAt(i);			// i를 넣어주면 하나씩 반복하며 출력함

			System.out.println(i + " : " + ch);
			
		}
		
		sc.close();
		
	}
	
	
	/**
	 * <pre>
	 * 	while문 연습
	 * 	- 1부터 입력받은 정수까지의 합계를 구하는 예제
	 * </pre>
	 */
	public void testWhileExample2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("=========== for문 =============");	// TODO 과제
		
		
		
		System.out.println("=========== while문 ============");
		int i = 1;
		int sum = 0;	//	TODO 합계를 구하기 위해 변수 선언 및 초기화
		
		while(i <= num) {
			sum += i;	//	TODO 내가 매번 미스했던 부분
			i++;
			
		}
	
		System.out.println("1부터 입력받은 정수 : " + num + "까지의 합은 " + sum + "입니다.");
	
		sc.close();
	}
	
	
	/**
	 * <pre>
	 * 	- while문을 이용하여 구구단을 2단부터 9단까지 출려
	 * </pre>
	 */
	public void testWhileExample3() {
		
		// 중첩 while문을 이용한 구구단 출력하기
		int dan = 2;
		while(dan < 10) {
			
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;

			}
			
			System.out.println();
			dan++;
			
		}
		
		
	}
	
	
}


