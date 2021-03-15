package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		// 문자열 합치기 테스트
		System.out.println("====== 두 개의 문자열 합치기 ======");
		System.out.println(9 + 9);	  // 18
		System.out.println("9" + 9);  // 99
		System.out.println(9 + "9");  // 99
		System.out.println("9" + "9");// 99
		
		System.out.println("====== 세 개의 문자열 합치기 ======");
		System.out.println(9 + 9 + "9");	// 189 
		// '+' 연산방향은 왼쪽에서 오른쪽이다
		System.out.println(9 + "9" + 9);
		//                  "99" + 9
		//                  "999" 
		System.out.println("9" + 9 + 9);   // 999
		// 괄호 기호를 이용해서 숫자 연산을 묶어주게되면 괄호 안에 있는 연산을 우선 수행한다.
		System.out.println("9" + (9 + 9));// 918
		
		// 문자열 합치기 응용
		System.out.println("========= 10과 20의 사칙연산 결과=========");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);
		System.out.println(10 % 20);
		
		System.out.println("========= 10과 20의 사칙연산 결과(보기좋게)=========");
		System.out.println("10과 20의 합 : " + (10 + 20));
		System.out.println("10과 20의 차 : " + (10 + 20));
		System.out.println("10과 20의 곱 : " + (10 + 20));
		System.out.println("10과 20의 나누기 한 몫 : " + (10 + 20));
		System.out.println("10과 20의 나누기 한 나머지 : " + (10 + 20));
		
	}

}
