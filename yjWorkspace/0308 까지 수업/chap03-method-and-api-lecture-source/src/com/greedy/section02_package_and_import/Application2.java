package com.greedy.section02_package_and_import;

import com.test.*;
// 사용하려는 클래스까지를 작성
import com.greedy.section01.method.Calculator;
import com.greedy.section01.method.StaticTest;

// static import의 경우 static method까지 전부 써줘야 한다.
import static com.greedy.section01.method.Calculator.maxNumberOf;

public class Application2 {
	
	public static void main(String[] args) {
		
		/*
		 * 임포트(import) : 서로 다른 패키지에 존재하는 클래스를 사용하는 경우
		 *                패키지명을 포함한 풀 클래스 이름을 사용해야한다.
		 *                패키지명을 생략하고 사용할 수 있도록 한 구문이 import구문이다.
		 *                
		 *    import의 선언 위치는 page선언문과 class선언문 사이에 작성하며
		 *    어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 */
		
		// non-static method인 경우
		// ctrl + shift + o 
		Calculator calc = new Calculator(); // section01
		int min = calc.minNumberOf(50, 60);
		
		System.out.println("50과 60 중 더 작은 값은 : " + min);

		com.test.Calculator calc1 = new com.test.Calculator(); // test
		int min1 = calc1.minNumberOf(50, 60);                                    // test
		System.out.println("50과 60 중 더 작은 값은 : " + min1);
		
		// static method인 경우 
		// --> 클래스명을 생략해서 사용할 수 있다.
		int max2 = maxNumberOf(100, 200);
		System.out.println("100과 200중 더 큰 값은 : " + max2);
		
		// max와 min을 사용해보자 (API에 이미 정의가 되어있다.)
		System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));
		
		System.out.println("원주율 : " + Math.PI);
		
		// 난수 발생
		// 0부터 1전까지의 실수 형태의 난수를 발생시킨다.
		System.out.println("난수 발생 : " + Math.random());
		
		
		
		
		
		// static 일때
		int addd = StaticMeTe.add1(2, 4);
		
		int add2 = StaticTest.add(5, 5);
		System.out.println(add2);
		
		
		
		StaticTest.name();
		
	}
}






