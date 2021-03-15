package com.greedy.section02_pakage_and_import;

//사용하는 클래스 까지 작성.
import com.greedy.section01.method.Calculator;
// import com.greedy.section01.method.*; * =  패키지 하위의 모든 클래스의 기능을 불러오겠다.


// static import의 경우 static method까지 전부 써준다.
import static com.greedy.section01.method.Calculator.maxNumberOf;

public class Application2 {
	public static void main(String[] args) {
		
	/*
	 * 임포드(import) : 서로다은 패키지에 존재하는 클래스를 사용하는 경우에
	 *                패키지명을 포함한 풀 클래스 이름을 사용한다.
	 *                패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
	 *                
	 *  import의 선언 위치는 pakage선언문과 class 선언문 사이에 작성하며
	 *  어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
	 *  
	 *               
	 * 
	 * 
	 */
		
	
		//non-static method 인경우   1. 자동완성 2. 수기 작성
		// ctrl + shift + o
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(5, 6);
		
		System.out.println("5 6 중 작은수  : " + min);
	
		
		//static 메소드인 경우
		int max = maxNumberOf(55, 66);
		System.out.println("55,  66 중 큰수  : " + max);
		
		
		//(Math 클래스에서) max 와 min (라는 메소드) 사용해보자 + PI 라는 필드변수 (API에 이미 정의 되어있다.)
		System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));
		
		System.out.println("원주율 : " + Math.PI);
		
		
		// 난수 발생
		// 0부터 1전 까지의 실수 형태의 난수를 발생시킨다.
		System.out.println("난수 발생 : " + Math.random());
		// 실행 될 때마다 값이 바뀜
		
		
		
		
		
		
		
		
		
		
	}

}
