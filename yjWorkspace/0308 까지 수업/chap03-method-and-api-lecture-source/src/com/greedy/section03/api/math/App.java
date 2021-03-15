package com.greedy.section03.api.math;
// 메소드 정리
public class App {
	
	
// 1. 메소드는 클래스 안에 써야댐.
	public void appp() {
		
	}
	
// 2. 반환 자료형이 void 를 제외하면 return 필요, return 옆에 반환 자료형에 알맞는 자료형 작성.
	public int num() {
		
		return 5;
	}
	
// 3. 변수 선언해서 return 변수이름; 도 가능
	public int num1() {
		int result = 10;
		return result;  //num1 은 int result = 10
	}
	
// 4. 기능 만들땐 무제껀 void ? 아님 
	public int add(int a , int b) {
		
		int result = a + b;
		System.out.println(result);
		
		return result;
		
	}

// 4. static 변수 선언
	public static void snum1() {
		
	}
}
