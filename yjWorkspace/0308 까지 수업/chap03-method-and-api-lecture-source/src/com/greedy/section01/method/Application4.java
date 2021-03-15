package com.greedy.section01.method;

public class Application4 {
	public static void main(String[] args) {
		
		// 여러개의 전달인자를 이용한 메소드 호출을 테스트
		
		// 1. 여러 개의 매개변수를 가진 메소드 호출
		Application4 app4 = new Application4();
		
		app4.testMethod("홍길동", 20,'남' );
		
		// 2. 변수에 저장된 값을 전달하여 호출 가능.
		
		String name = "유관순";
		int age = 25;
		char gender = '여';
		
		app4.testMethod(name, age, gender); // 매개변수를 호출 할때 (이때) 상수로 선언.
		
		
	}

	//설명하고자 하는 메소드 위에 커서를 올리고 알트 쉬프트 제이 = 메소드 설명
	/**
	 * <pre>
	 * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공합니다.
	 * </pre>
	 * @since 2021 02 16
	 * @param name 출력할 이름을 전달해 주세여
	 * @param age 출력할 나이를 전달해 주세요
	 * @param gender 출력할 성별을 전달해 주세여. 성별은 변경되지 않을 것을 보장합니다.
	 */
	public void testMethod(String name, int age, final char gender) {
		
		// 매개변수 역시 final키워드 사용가능.
		// final 매개변수는 상수 네이밍 규칙(대문자만) 을 선택적으로 따르는 경향이 있다.(소문자 써도댐)
		// 매개변수도 일종의 지역변수로 분류된다.
		// 지역변수 final 키워드 붙여 상수를 만드는 것은 동일하다.
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 "+ age + " 세 이며 , 성별은 " + gender + " 입니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
