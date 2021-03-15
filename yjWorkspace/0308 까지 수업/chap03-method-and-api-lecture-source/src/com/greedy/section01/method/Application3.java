package com.greedy.section01.method;

public class Application3 {
	public static void main(String[] args) {
		
		/*
		 * 전달인자(argument)와 매개변수(parameter)               //arg의 복수 args 
		 * 지금까지 우리가 배운 변수는 지역변수에 해당한다.
		 * 
		 * 변수의 종류
		 * 1. 지역 변수
		 * 2. 매개 변수
		 * 3. 전역 변수 (필드 변수) (클래스 사이)
		 * 4. 클래스(static) 변수
		 * 
		 * 
		 * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
		 * 다른 메소드 간의 서로 공휴해야 하는 값이 존재 하는 경우에는
		 * 메고드 호출 시 사용하는 괄호를 이용하여 값을 전달할 수 있다.
		 * 이 떄 전달하는 값을 전달인자(argument)라고 부르고
		 * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개 변수(parameter)라고 부른다. 
		 */

		Application3 app3 = new Application3();
		
		// 1. 전달인자로 값 전달 테스트
		// 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 매개변수의 갯수, 순서가 일치 해야 한다.
		app3.testMethod(10/*인자 자리*/);
		
		//app3.testMethod("40");  매개변수 인자기가 int 이므로 알맞는 자료형으로 바꿔준다.
		//app3.testMethod(20,30); 매개변수는 int 1개 이지만 인자는 3개이기 때문에 호출 불가.
		//app3.testMethod();      매개변수가 선언 되어 있기 때무네 무제~~껀 값을 선언해 줘야함. ㅇㅇ
		
		
		// 2. 변수에 저장한 값 전달 테스트
		// 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다.
		int age = 20;
		
		app3.testMethod(age);
		
		// 2-2. 자동 형변환을 이용하여 값을 전달할 수 있다.
		byte byteAge = 11;
		app3.testMethod(byteAge);
		
		// 2-3. 강제 형변환을 이용하여 값을 전달할 수 있다.
		long longAge = 90;
		app3.testMethod((int) longAge);
		
		// 2-4. 연산 결과를 이용해서 값 전달을 할 수 있다.
		app3.testMethod(age * 2);
		
		
		
		
	}
	
	public void testMethod(int age /*매개변수 공간*/) {
		System.out.println("당신의 나이는 " + age + " 세 입니다." );
	}
}
