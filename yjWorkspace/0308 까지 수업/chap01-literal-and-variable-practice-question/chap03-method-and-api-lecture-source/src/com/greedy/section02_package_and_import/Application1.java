package com.greedy.section02_package_and_import;


public class Application1 {
	
	public static void main(String[] args) {
		
		// 패키지와 임포트
		/*
		 * 패키지 : 서로 관련있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
		 *        같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진
		 *        클래스를 만들 수 있다.
		 * 
		 * 
		 */
		
		// 이전에 만든 Calculator클래스를 불러올려면 패키지명을 추가해주어야한다.
		
		// 지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 "동일한 패키지"내에서 사용했기 때문이다.
		// 그렇기 때문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는 
		// 클래스명 앞에 패키지명을 명시해서 풀 클래스 이름으로 사용해야 한다.
		
		// 주의!! 객체를 생성하기위해서 맨 앞에 클래스명에 풀패키지명을 붙여주었으면
		//       new 뒤에나오는 Calculator() 앞에도 com.greedy.section01.method.Calculator()
		//       이런식으로 패키지명을 반드시 붙여주어야 한다.
		
		// * non-static 메소드의 경우
		com.greedy.section01.method.Calculator calc 
				= new com.greedy.section01.method.Calculator();
		
		int min = calc.minNumberOf(30, 20);
		
		System.out.println("30과 20중 더 작은 값은 : " + min);
		
		// * static 메소드의 경우
		int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
		
		System.out.println("30과 20중 더 큰 값은 : " + max);
		
		
		
		
		
		
		
		
		
		
	}
}
