package com.greedy.section01.method;

public class Application1 {
public static void main(String[] args) {
		
		// 메소드란?
		// 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		
		// 1. 먼저 main() 메소드가 동작하는지 확인하기 위한 출력문 
		System.out.println("main() 시작됨....");
		
		// 2. main method 밖에 하단에 methodA라는 메소드를 추가하고 호출해보자
		// 클래스명 사용할이름 = new 클래스명();		// 객체 생성
		// 사용할이름.메소드명();                    // 메소드 호출
		
		Application1 app1 = new Application1();
		app1.methodA();
		
		System.out.println("main() 종료됨....");
	}//TODO 투두 숨기기
	
	public void methodA() {
		
		System.out.println("methodA() 호출함..");
		methodB();// 이런 형식으로 호출함. 메소드 끼리.
	}
	
	public void methodB() {
		
		System.out.println("methodB() 호출함..");
		
		methodC();
		
		System.out.println("methodB() 종료됨..");
	}
	
	public void methodC() {
		System.out.println("methodC() 호출함...");
		
		System.out.println("methodC() 종료됨...");
	}
	
}





