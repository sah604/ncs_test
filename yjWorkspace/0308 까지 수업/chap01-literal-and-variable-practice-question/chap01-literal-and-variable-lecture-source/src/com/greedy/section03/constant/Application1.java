package com.greedy.section03.constant;

public class Application1 {

	public static void main(String[] args) {
		
		// 상수의 사용 목적
		// 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
		// 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
		// 예)프로그램내에서 고정적인 값, 수학공식에 사용되는 수칙
		
		/* 1. 상수 선언 */
		/* 상수 선언 시 자료형 앞에 final 키워드를 붙인다. */
		final int AGE;
		
		/* 2. 초기화 */
		AGE = 20;
		//AGE = 30; // 한 번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.
		
		/* 3. 필요한 위치에 상수를 호출해서 사용한다. */
		/* 3-1. 출력 구문에서 사용 */
		System.out.println("AGE의 값 : " + AGE);
		
		/* 3-2. 필요시 연산식에 호출해서 사용 */
		System.out.println("AGE의 2배 : " + (AGE * 2));
		
		/* 3-3. 대입연산시 활용 */
		int sum = AGE;
		sum = sum + 10;
		System.out.println("sum의 합 : " + sum);
		//AGE = AGE + 10; // 대입연산자의 왼쪽에는 기술 불가능하다.
	}

}
