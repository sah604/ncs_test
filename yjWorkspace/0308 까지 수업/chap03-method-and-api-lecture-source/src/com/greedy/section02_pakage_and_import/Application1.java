package com.greedy.section02_pakage_and_import;



public class Application1 {
	public static void main(String[] args) {
		
		// 패키지와 임포트
		/*
		 * 패키지 : 서로 관련있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
		 *        * 같은 패키지 내에서는 동일한 이름의 클래스를 만들수 없지만, 패키지가 다르면  동일한 이름을 가진
		 *          클래스를 만들 수 있다.
		 * 
		 * 
		 * */
		
		// 이전에 만든 Calculator 클래스를 불러오려면 '다른 패키지에 존재하기 때문에'
		// 클래스 이름 앞에 패키지명을 추가해주어야 한다.
		// 그리고 new 뒤에도 패키지명을 추가해주고 작성한다.
		
		//* non-static 메소드의 경우
		com.greedy.section01.method.Calculator calc = new com.greedy.section01.method.Calculator();
		
		// 그렇기 때문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우엔
		// 방법1. 클래스명 앞에 패키지 명을 명시해서 클래스 이름으로 사용해야 한다.
		
		
		int min = calc.minNumberOf(30, 20);
		
		System.out.println("30과 20중 더 작은 값은? : " + min);
		
		
		// * 패키지가 다른 static 메소드를 호출 할 경우 = 객체 생성 안해도됨. 
		int max = com.greedy.section01.method.Calculator.maxNumberOf(30, 20);
		System.out.println("30과 20중 더 큰 값은? : " + max);
		
	}

}
