package com.greedy.section01.method;

public class Application9 {
	public static void main(String[] args) {
		
		
		// 다른 클래스에 작성한 메소드 호출
		
		// 최대값, 최솟값을 비교할 두 정수를 변수로 선언
		int first = 50;
		int second = 100;
		
		// 1. non-static 메소드의 경우
		// 클래스가 다르더라도 사용하는 방법은 동일.
		// 클래스명 사용할이름 = new 클래스명();
		// 사용할이름.메소드명();
		// TODO 체크
		
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(first, second);
		
		System.out.println("두 수 중 최소값은 : " + min);
		
		// 2. static 메소드인 경우
		// 다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명 반드시 기술.
		// 클래스명.메소드명(); 
		int max = Calculator.maxNumberOf(first, second);
		
		System.out.println("두 수 중 최댓값은 : " + max);
		
		/*
		 * 주의 !
		 * static 메소드도 non-static 메소드처럼 호출은 가능하다.
		 * 하지만, 권장하지 않는다.
		 * 
		 *  이미 메모리에 로딩(저장) 되어 있는 static 메소드는 여러 객체가 공유하게 된다.
		 *  그 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못한 동작을 유발 가능 하기 떄문이다.
		 *  // 스태틱으로 저장하면 스태틱만의 우덜식 저장소로 들어간다. 그래서 인스턴스화 하지 않아도 꺼내 쓰기 가능.
		 *  // (static 섬 : static 섬에선 출생신고 하지 않아도 살아간다. 어딘가에 살아있음 ) 
		 *  // 출생신고 : ClassName 변수이름 = new ClassName(); 
		 *  // 근본없는 static = 출생신고도 하지 않은채 암암리에 메소드 팔이 가능.(탈세)
		 *  // className.methodName(); 만으로 호출가능(다른 클래스에서도)
		 *  
		 *    // 딱 정리 static = 연변거지  // static(연변) 이라는 곳에서 태어나면 연변에 저장돼 있다가 연변에서 출생신고도 하지 않고 살아가며 신세계 형님들이 호출하면 달려온다.
		 *    // static 연변거지 출생신고 하지 않는 이유 = 예상치 못한 동작을 유발 할 수도 있기 때문에
		 *    // static 은 s라는 낙인이 찍혀있다. 그것을보고 조심히 행동 할 것.  
		 * */
	}

}






















