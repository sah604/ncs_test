package com.greedy.section01.method;

public class Application2 {
	public static void main(String[] args) {
		
		// 메소드 호출 흐름 연습
		
		System.out.println("main() 시작함...");
		
		// 메소드를 실행하고 종료후 에는 다시 호출한 곳으로 되돌아 온다.(리턴)
		// 클래스 = 메소드 실행을위한 도구임. //클래스 안에 메소드
		
		Application2 app2 = new Application2();
		app2.methodA();
		app2.methodB();
		app2.methodC();
		
		System.out.println("main() 종료됨...");
	}
	//
	public void methodA() {
		System.out.println("methodA() 호출됨...");
		
		System.out.println("methodA() 종료됨...");
	}

	public void methodB() {
		System.out.println("methodB() 종료됨...");
		
		System.out.println("methodB() 종료됨...");
		
	}
	
	public void methodC() {
		System.out.println("methodC() 종료됨...");
		
		System.out.println("methodC() 종료됨...");
		
	}
}
